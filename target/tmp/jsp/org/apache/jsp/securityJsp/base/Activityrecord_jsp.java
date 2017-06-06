package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.util.base.SecurityUtil;

public final class Activityrecord_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("$(function() {\r\n");
      out.write("\tgrid = $('#grid').datagrid({\r\n");
      out.write("\t\ttitle : '',\r\n");
      out.write("\t\turl : sy.contextPath + '/base/record!doNotNeedSecurity_getRecordByActivityUserId.sy',\r\n");
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
      out.write("\t\t\tfield : 'activityName',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t}, {\r\n");
      out.write("\t\t\twidth : '100',\r\n");
      out.write("\t\t\ttitle : '用户名',\r\n");
      out.write("\t\t\tfield : 'userName',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t},{\r\n");
      out.write("\t\t\twidth : '80',\r\n");
      out.write("\t\t\ttitle : '活动图片',\r\n");
      out.write("\t\t\tfield : 'activityUrl',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t} , {\r\n");
      out.write("\t\t\twidth : '80',\r\n");
      out.write("\t\t\ttitle : '分数',\r\n");
      out.write("\t\t\tstyle:'text-alert:center',\r\n");
      out.write("\t\t\tfield : 'activityScore',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t}] ],\r\n");
      out.write("\t\tcolumns : [ [ {\r\n");
      out.write("\t\t\twidth : '150',\r\n");
      out.write("\t\t\ttitle : '创建时间',\r\n");
      out.write("\t\t\tfield : 'createdatetime',\r\n");
      out.write("\t\t\tsortable : true\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t] ],\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\ttoolbar : '#toolbar',\r\n");
      out.write("\t\tonBeforeLoad : function(param) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t},\r\n");
      out.write("\t\tonLoadSuccess : function(data) {\r\n");
      out.write("\t\t\t//$('.iconImg').attr('src', sy.pixel_0);\r\n");
      out.write("\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\"easyui-layout\" data-options=\"fit:true,border:false\">\r\n");
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
