<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="sy.util.base.SecurityUtil"%>
<%
	String contextPath = request.getContextPath();
	SecurityUtil securityUtil = new SecurityUtil(session);
%>
<!DOCTYPE html>
<html>
<head>
<title></title>
<jsp:include page="../../inc.jsp"></jsp:include>
<script type="text/javascript">
var grid;
$(function() {
	grid = $('#grid').datagrid({
		title : '',
		url : sy.contextPath + '/base/record!doNotNeedSecurity_getRecordByActivityUserId.sy',
		striped : true,
		rownumbers : true,
		pagination : true,
		singleSelect : true,
		idField : 'id',
		sortName : 'createdatetime',
		sortOrder : 'desc',
		pageSize : 50,
		pageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],
		frozenColumns : [ [ {
			width : '100',
			title : '活动名',
			field : 'activityName',
			sortable : true
		}, {
			width : '100',
			title : '用户名',
			field : 'userName',
			sortable : true
		},{
			width : '80',
			title : '活动图片',
			field : 'activityUrl',
			sortable : true
		} , {
			width : '80',
			title : '分数',
			style:'text-alert:center',
			field : 'activityScore',
			sortable : true
		}] ],
		columns : [ [ {
			width : '150',
			title : '创建时间',
			field : 'createdatetime',
			sortable : true
		}
		] ],
		
		
		
		toolbar : '#toolbar',
		onBeforeLoad : function(param) {
			parent.$.messager.progress({
				text : '数据加载中....'
			});
		},
		onLoadSuccess : function(data) {
			//$('.iconImg').attr('src', sy.pixel_0);
			parent.$.messager.progress('close');
		}
	});
});
</script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
	<div data-options="region:'center',fit:true,border:false">
		<table id="grid" data-options="fit:true,border:false"></table>
	</div>
</body>
</html>