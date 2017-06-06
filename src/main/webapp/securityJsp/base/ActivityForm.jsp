<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String contextPath = request.getContextPath();
%>
<%
	String id = request.getParameter("id");
	if (id == null) {
		id = "";
	}
%>
<!DOCTYPE html>
<html>

<head>
<title></title>
<jsp:include page="../../inc.jsp"></jsp:include>
<style type="text/css">
#filelist{
width: 100px;
}
</style>
<script type="text/javascript">

var grid;
var uploader;//上传对象

var submitNow = function($dialog, $grid, $pjq) {
	var data = sy.serializeObject($('form')); 
	var url;
	if ($(':input[name="data.id"]').val().length > 0) { 
		url = sy.contextPath + '/base/activity!update.sy';
	} 
	else {
		url = sy.contextPath + '/base/activity!save.sy';
	}
	$.post(url, data, function(result) {
		if (result.success) {
			parent.sy.progressBar('close');//关闭上传进度
			$grid.datagrid('reload');
			$dialog.dialog('destroy');
		} else {
			$pjq.messager.alert('提示', result.msg, 'error');
		}
	}, 'json');
};


var submitForm = function($dialog, $grid, $pjq) {
	if ($('form').form('validate')) {
		if (uploader.files.length > 0 ) {
			uploader.start();
			uploader.bind('StateChanged', function(uploader) {// 在所有的文件上传完毕时，提交表单
		 		if (uploader.files.length === (uploader.total.uploaded + uploader.total.failed)) {
		 			submitNow($dialog, $grid, $pjq);
				} 
			});
		} else {
			submitNow($dialog, $grid, $pjq);
		}
	 } 
};
	
	
	
/* 	var showIcons = function() {
		var dialog = parent.sy.modalDialog({
			title : '浏览小图标',
			url : sy.contextPath + '/style/icons.jsp',
			buttons : [ {
				text : '确定',
				handler : function() {
					dialog.find('iframe').get(0).contentWindow.selectIcon(
							dialog, $('#iconCls'));
				}
			} ]
		});
	}; */
	$(function() {
 		if ($(':input[name="data.id"]').val().length > 0) {
			parent.$.messager.progress({
				text : '数据加载中....'
			});
			$.post(sy.contextPath + '/base/activity!getById.sy',
			{
				id : $(':input[name="data.id"]').val()
			},
			function(result) {
				if (result.id != undefined) {
					$('form').form('load',{
						'data.id' : result.id,
						'data.name' : result.name,
						//'data.nickname' : result.nickname,
						'data.url' : result.url,
						//'data.syorganization.id' : result.syorganization ? result.syorganization.id
						//		: '',
						//'data.iconCls' : result.iconCls,
						'data.seq' : result.seq,
						'data.code' : result.code
						});
					console.info(result.headurl);
					$('#photo').attr('src',result.url); 
					$('#iconCls').attr('class', result.iconCls); //设置背景图标
				}
				parent.$.messager.progress('close');
			}, 'json');
		} 

		//图片上传

		uploader = new plupload.Uploader({ //上传插件定义
			browse_button : 'pickfiles', //选择文件的按钮
			container : 'container', //文件上传容器
			runtimes : 'html5,flash', //设置运行环境，会按设置的顺序，可以选择的值有html5,gears,flash,silverlight,browserplus,html4
			flash_swf_url : sy.contextPath
					+ '/jslib/plupload_1_5_7/plupload/js/plupload.flash.swf', // Flash环境路径设置
			url : sy.contextPath + '/plupload?fileFolder=/userPhoto', //上传文件路径
			max_file_size : '5mb', //100b, 10kb, 10mb, 1gb
			chunk_size : '10mb', //分块大小，小于这个大小的不分块
			unique_names : true, //生成唯一文件名
			// 如果可能的话，压缩图片大小
			/*resize : {
				width : 320,
				height : 240,
				quality : 90
			},*/
			// 指定要浏览的文件类型
			filters : [ {
				title : '图片文件',
				extensions : 'jpg,gif,png'
			} ]
		});
		uploader.bind('Init', function(up, params) { //初始化时
			//$('#filelist').html("<div>当前运行环境: " + params.runtime + "</div>");
			$('#filelist').html("");
		});
		uploader.bind('BeforeUpload', function(uploader, file) { //上传之前
			if (uploader.files.length > 1) {
				parent.$.messager.alert('提示', '只允许选择一张照片！', 'error');
				uploader.stop();
				return;
			}
			$('.ext-icon-cross').hide();
		});
		uploader.bind(
						'FilesAdded',
						function(up, files) { //选择文件后
							$.each(
											files,
											function(i, file) {
												$('#filelist').append(
																'<div id="' + file.id + '">'
																		+ file.name
																		+ '('
																		+ plupload.formatSize(file.size)
																		+ ')<strong></strong>'
																		+ '<span onclick="uploader.removeFile(uploader.getFile($(this).parent().attr(\'id\')));$(this).parent().remove();" style="cursor:pointer;" class="ext-icon-cross" title="删除">&nbsp;&nbsp;&nbsp;&nbsp;</span></div>');
											});
							up.refresh();
						});
		uploader.bind('UploadProgress', function(up, file) { //上传进度改变
			var msg;
			if (file.percent == 100) {
				msg = '99'; //因为某些大文件上传到服务器需要合并的过程，所以强制客户看到99%，等后台合并完成...
			} else {
				msg = file.percent;
			}
			$('#' + file.id + '>strong').html(msg + '%');

			parent.sy.progressBar({ //显示文件上传滚动条
				title : '文件上传中...',
				value : msg
			});
		});
		uploader.bind('Error', function(up, err) { //出现错误
			$('#filelist').append(
					"<div>错误代码: " + err.code + ", 描述信息: " + err.message
							+ (err.file ? ", 文件名称: " + err.file.name : "")
							+ "</div>");
			up.refresh();
		});
		uploader.bind('FileUploaded', function(up, file, info) { //上传完毕
			var response = $.parseJSON(info.response);
			$(".photo").val(("/sshe"+response.fileUrl));
			$('#photo').attr('src',"/sshe"+response.fileUrl); 
			if (response.status) {
				$('#' + file.id + '>strong').html("100%");
				//console.info(response.fileUrl);
				//console.info(file.name);
				//$('#f1').append('<input type="hidden" name="fileUrl" value="'+response.fileUrl+'"/>');
				//$('#f1').append('<input type="hidden" name="fileName" value="'+file.name+'"/><br/>');
				$(':input[name="data.photo"]').val(response.fileUrl);
			}
		});
		uploader.init();
		
	});
</script>
</head>

<body>
	<form method="post" class="form">
		<fieldset>
			<legend>活动基本信息</legend>
			<table class="table" style="width: 100%;">
				<tr>
					<th>编号</th>
					<td><input name="data.id" value="<%=id%>" readonly="readonly" />
					</td>
				</tr>
			<!-- 	<tr>
					<th>登录名</th>
					<td><input name="data.nickname" class="easyui-validatebox"
						data-options="required:true" /></td>
				</tr> -->
				<tr>
					<th>活动名</th>
					<td><input name="data.name" class="easyui-validatebox"
						data-options="required:true" /></td>
				</tr>
<!-- 				<tr>
					<th>性别</th>
					<td><select class="easyui-combobox" name="data.sex"
						data-options="panelHeight:'auto',editable:false"
						style="width: 155px;">
							<option value="1">男</option>
							<option value="0">女</option>
					</select></td>
				</tr> -->
				<tr>
					<th>活动图片上传</th>					<td>
					 <input name="data.url" readonly="readonly" style="display: none;" class = "photo" class="easyui-validatebox"
						data-options="required:true" />
					<img id="photo" src="/sshe/ssheUploadFile/userPhoto/2017/06/01/009b3eb7ddca45babe87af5feb819631.jpg" style=" height: 200px;">
					</td><td>
					
					<div id="container">
							<a id="pickfiles" href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'ext-icon-zoom'">选择文件</a>
							<div id="filelist">您的浏览器没有安装Flash插件，或不支持HTML5！</div>
						</div>
					</td>

				</tr>
			</table>
		</fieldset>
	</form>
</body>

</html>
