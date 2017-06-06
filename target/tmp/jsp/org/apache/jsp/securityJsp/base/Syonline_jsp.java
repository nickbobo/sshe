package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.util.base.SecurityUtil;

public final class Syonline_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\tvar grid;\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\t\tgrid = $('#grid').datagrid({\r\n");
      out.write("\t\t\ttitle : '',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/base/syonline!grid.sy',\r\n");
      out.write("\t\t\tstriped : true,\r\n");
      out.write("\t\t\trownumbers : true,\r\n");
      out.write("\t\t\tpagination : true,\r\n");
      out.write("\t\t\tsingleSelect : true,\r\n");
      out.write("\t\t\tidField : 'id',\r\n");
      out.write("\t\t\tsortName : 'createdatetime',\r\n");
      out.write("\t\t\tsortOrder : 'desc',\r\n");
      out.write("\t\t\tpageSize : 100,\r\n");
      out.write("\t\t\tpageList : [ 10, 20, 30, 40, 50, 100, 200, 300, 400, 500, 1000 ],\r\n");
      out.write("\t\t\tfrozenColumns : [ [ {\r\n");
      out.write("\t\t\t\twidth : '100',\r\n");
      out.write("\t\t\t\ttitle : '登录名',\r\n");
      out.write("\t\t\t\tfield : 'loginname',\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '300',\r\n");
      out.write("\t\t\t\ttitle : 'IP地址',\r\n");
      out.write("\t\t\t\tfield : 'ip',\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\t\twidth : '150',\r\n");
      out.write("\t\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\t\tsortable : true\r\n");
      out.write("\t\t\t}, {\r\n");
      out.write("\t\t\t\twidth : '100',\r\n");
      out.write("\t\t\t\ttitle : '类别',\r\n");
      out.write("\t\t\t\tfield : 'type',\r\n");
      out.write("\t\t\t\tsortable : true,\r\n");
      out.write("\t\t\t\tformatter : function(value, row, index) {\r\n");
      out.write("\t\t\t\t\tswitch (value) {\r\n");
      out.write("\t\t\t\t\tcase '0':\r\n");
      out.write("\t\t\t\t\t\treturn '注销系统';\r\n");
      out.write("\t\t\t\t\tcase '1':\r\n");
      out.write("\t\t\t\t\t\treturn '登录系统';\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ] ],\r\n");
      out.write("\t\t\ttoolbar : '#toolbar',\r\n");
      out.write("\t\t\tonBeforeLoad : function(param) {\r\n");
      out.write("\t\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t\t});\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t\t$('.iconImg').attr('src', sy.pixel_0);\r\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
      out.write("\t<div id=\"toolbar\" style=\"display: none;\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<form id=\"searchForm\">\r\n");
      out.write("\t\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>登录名</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"QUERY_t#loginname_S_LK\" style=\"width: 80px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>IP地址</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"QUERY_t#ip_S_LK\" style=\"width: 80px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>类别</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><select name=\"QUERY_t#type_S_EQ\" class=\"easyui-combobox\" data-options=\"panelHeight:'auto',editable:false\"><option value=\"\">请选择</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"1\">登录系统</option>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<option value=\"0\">注销系统</option></select></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td>创建时间</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><input name=\"QUERY_t#createdatetime_D_GE\" class=\"Wdate\" onclick=\"WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})\" readonly=\"readonly\" style=\"width: 120px;\" />-<input name=\"QUERY_t#createdatetime_D_LE\" class=\"Wdate\" onclick=\"WdatePicker({readOnly:true,dateFmt:'yyyy-MM-dd HH:mm:ss'})\" readonly=\"readonly\" style=\"width: 120px;\" /></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<td><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-zoom',plain:true\" onclick=\"grid.datagrid('load',sy.serializeObject($('#searchForm')));\">过滤</a><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-zoom_out',plain:true\" onclick=\"$('#searchForm input').val('');grid.datagrid('load',{});\">重置过滤</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<table>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td><a href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-table_go',plain:true\" onclick=\"\">导出</a></td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</td>\r\n");
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
