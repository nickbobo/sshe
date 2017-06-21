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
var addFun = function() {
	var dialog = parent.sy.modalDialog({
		title : '添加活动信息',
		url : sy.contextPath + '/securityJsp/base/ActivityForm.jsp',
		buttons : [ {
			text : '添加',
			handler : function() {
				dialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$);
			}
		} ]
	});
};

var showFun = function(id) {
	var dialog = parent.sy.modalDialog({
		title : '查看活动信息',
		url : sy.contextPath + '/securityJsp/base/ActivityForm.jsp?id=' + id
	});
};

var editFun = function(id) {
	var dialog = parent.sy.modalDialog({
		title : '编辑活动信息',
		url : sy.contextPath + '/securityJsp/base/ActivityForm.jsp?id=' + id,
		buttons : [ {
			text : '编辑',
			handler : function() {
				dialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$);
			}
		} ]
	});
};
var removeFun = function(id) {
	parent.$.messager.confirm('询问', '您确定要删除此记录？', function(r) {
		if (r) {
			$.post(sy.contextPath + '/base/activity!delete.sy', {
				id : id
			}, function() {
				grid.datagrid('reload');
			}, 'json');
		}
	});
};
$(function() {
	grid = $('#grid').datagrid({
		title : '',
		url : sy.contextPath + '/base/activity!grid.sy',
/*         loadFilter:function(data){
        	return data.data;
        }, */
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
			field : 'name',
			sortable : true
		}, {
			width : '80',
			title : '活动图片',
			field : 'url',
			sortable : true
		} ] ],
		columns : [ [ {
			width : '150',
			title : '创建时间',
			field : 'createdatetime',
			sortable : true
		}, {
			title : '操作',
			field : 'action',
			width : '90',
			formatter : function(value, row) {
				var str = '';
				<%if (securityUtil.havePermission("/base/syuser!getById")) {%>
					str += sy.formatString('<img class="iconImg ext-icon-note" title="查看" onclick="showFun(\'{0}\');"/>', row.id);
				<%}%>
				<%if (securityUtil.havePermission("/base/syuser!update")) {%>
					str += sy.formatString('<img class="iconImg ext-icon-note_edit" title="编辑" onclick="editFun(\'{0}\');"/>', row.id);
				<%}%>
		<%-- 		<%if (securityUtil.havePermission("/base/syuser!grantRole")) {%>
					str += sy.formatString('<img class="iconImg ext-icon-user" title="用户角色" onclick="grantRoleFun(\'{0}\');"/>', row.id);
				<%}%>
				<%if (securityUtil.havePermission("/base/syuser!grantOrganization")) {%>
					str += sy.formatString('<img class="iconImg ext-icon-group" title="用户机构" onclick="grantOrganizationFun(\'{0}\');"/>', row.id);
				<%}%> --%>						
				<%if (securityUtil.havePermission("/base/syuser!delete")) {%>
					str += sy.formatString('<img class="iconImg ext-icon-note_delete" title="删除" onclick="removeFun(\'{0}\');"/>', row.id);
				<%}%>
				return str;
			}
		}
		] ],
		toolbar : '#toolbar',
		onBeforeLoad : function(param) {
			parent.$.messager.progress({
				text : '数据加载中....'
			});
		},
		onLoadSuccess : function(data) {
			$('.iconImg').attr('src', sy.pixel_0);
			parent.$.messager.progress('close');
		}
	});
});
</script>
</head>
<body class="easyui-layout" data-options="fit:true,border:false">
	<div id="toolbar" style="display: none;">
		<table>
			<tr>
				<%if (securityUtil.havePermission("/base/syorganization!save")) {%>
				<td><a href="javascript:void(0);" class="easyui-linkbutton" data-options="iconCls:'ext-icon-note_add',plain:true" onclick="addFun();">添加</a></td>
				<%}%>
				<!-- <td><div class="datagrid-btn-separator"></div></td>
				<td><a onclick="redoFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'ext-icon-resultset_next'">展开</a><a onclick="undoFun();" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'ext-icon-resultset_previous'">折叠</a></td>
				<td><div class="datagrid-btn-separator"></div></td> -->
				<td><a onclick="grid.datagrid('reload');" href="javascript:void(0);" class="easyui-linkbutton" data-options="plain:true,iconCls:'ext-icon-arrow_refresh'">刷新</a></td>
			</tr>
		</table>
	</div>
	<div data-options="region:'center',fit:true,border:false">
		<table id="grid" data-options="fit:true,border:false"></table>
	</div>
</body>
</html>