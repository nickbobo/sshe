package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.util.base.SecurityUtil;

public final class Activity_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");

	String contextPath = request.getContextPath();
	SecurityUtil securityUtil = new SecurityUtil(session);

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../inc.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("var grid;\r\n");
      out.write("var addFun = function() {\r\n");
      out.write("\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\ttitle : '添加活动信息',\r\n");
      out.write("\t\turl : sy.contextPath + '/securityJsp/base/ActivityForm.jsp',\r\n");
      out.write("\t\tbuttons : [ {\r\n");
      out.write("\t\t\ttext : '添加',\r\n");
      out.write("\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\tdialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} ]\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("var showFun = function(id) {\r\n");
      out.write("\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\ttitle : '查看活动信息',\r\n");
      out.write("\t\turl : sy.contextPath + '/securityJsp/base/ActivityForm.jsp?id=' + id\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("var editFun = function(id) {\r\n");
      out.write("\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\ttitle : '编辑活动信息',\r\n");
      out.write("\t\turl : sy.contextPath + '/securityJsp/base/ActivityForm.jsp?id=' + id,\r\n");
      out.write("\t\tbuttons : [ {\r\n");
      out.write("\t\t\ttext : '编辑',\r\n");
      out.write("\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\tdialog.find('iframe').get(0).contentWindow.submitForm(dialog, grid, parent.$);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t} ]\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("var removeFun = function(id) {\r\n");
      out.write("\tparent.$.messager.confirm('询问', '您确定要删除此记录？', function(r) {\r\n");
      out.write("\t\tif (r) {\r\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/activity!delete.sy', {\r\n");
      out.write("\t\t\t\tid : id\r\n");
      out.write("\t\t\t}, function() {\r\n");
      out.write("\t\t\t\tgrid.datagrid('reload');\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("};\r\n");
      out.write("$(function() {\r\n");
      out.write("\tgrid = $('#grid').datagrid({\r\n");
      out.write("\t\ttitle : '',\r\n");
      out.write("\t\turl : sy.contextPath + '/base/activity!grid.sy',\r\n");
      out.write("\t\tstriped : true,\r\n");
      out.write("\t\trownumbers : true,\r\n");
      out.write("\t\tpagination : true,\r\n");
      out.write("\t\tsingleSelect : true,\r\n");
      out.write("\t\tidField : 'id',\r\n");
      out.write("\t\tsortName : 'createdatetime',\r\n");
      out.write("\t\tsortOrder : 'desc',\r\n");
      out.write("\t\tpageSize : 50,\r\n");
      out.write("\t\tpageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500 ],\r\n");
      out.write("\t\tfrozenColumns : [ [ {\r\n");
      out.write("\t\t\twidth : '100',\r\n");
      out.write("\t\t\ttitle : '活动名',\r\n");
      out.write("\t\t\tfield : 'name',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\twidth : '80',\r\n");
      out.write("\t\t\ttitle : '活动图片',\r\n");
      out.write("\t\t\tfield : 'url',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t} ] ],\r\n");
      out.write("\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\twidth : '150',\r\n");
      out.write("\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\ttitle : '操作',\r\n");
      out.write("\t\t\tfield : 'action',\r\n");
      out.write("\t\t\twidth : '90',\r\n");
      out.write("\t\t\tformatter : function(value, row) {\r\n");
      out.write("\t\t\t\tvar str = '';\r\n");
      out.write("\t\t\t\t");
if (securityUtil.havePermission("/base/syuser!getById")) {
      out.write("\r\n");
      out.write("\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note\" title=\"查看\" onclick=\"showFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t");
if (securityUtil.havePermission("/base/syuser!update")) {
      out.write("\r\n");
      out.write("\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note_edit\" title=\"编辑\" onclick=\"editFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t");
if (securityUtil.havePermission("/base/syuser!delete")) {
      out.write("\r\n");
      out.write("\t\t\t\t\tstr += sy.formatString('<img class=\"iconImg ext-icon-note_delete\" title=\"删除\" onclick=\"removeFun(\\'{0}\\');\"/>', row.id);\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\treturn str;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t] ],\r\n");
      out.write("\t\ttoolbar : '#toolbar',\r\n");
      out.write("\t\tonBeforeLoad : function(param) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t$('.iconImg').attr('src', sy.pixel_0);\r\n");
      out.write("\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t<div id=\"toolbar\" style=\"display: none;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t");
if (securityUtil.havePermission("/base/syorganization!save")) {
      out.write("\r\n");
      out.write("\t\t\t\t<td><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-note_add',plain:true\" onclick=\"addFun();\">添加</a></td>\r\n");
      out.write("\t\t\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\t<!-- <td><div class=\"datagrid-btn-separator\"></div></td>\r\n");
      out.write("\t\t\t\t<td><a onclick=\"redoFun();\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-resultset_next'\">展开</a><a onclick=\"undoFun();\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-resultset_previous'\">折叠</a></td>\r\n");
      out.write("\t\t\t\t<td><div class=\"datagrid-btn-separator\"></div></td> -->\r\n");
      out.write("\t\t\t\t<td><a onclick=\"grid.datagrid('reload');\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"plain:true,iconCls:'ext-icon-arrow_refresh'\">刷新</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div data-options=\"region:'center',fit:true,border:false\">\r\n");
      out.write("\t\t<table id=\"grid\" data-options=\"fit:true,border:false\"></table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
