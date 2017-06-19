package org.apache.jsp.securityJsp.base.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.util.base.SecurityUtil;

public final class userRoleChart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../../inc.jsp", out, false);
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\t$(function() {\r\n");
      out.write("\r\n");
      out.write("\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$('#container').highcharts({\r\n");
      out.write("\t\t\texporting : {\r\n");
      out.write("\t\t\t\tfilename : '用户角色分布'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tchart : {\r\n");
      out.write("\t\t\t\tplotBackgroundColor : null,\r\n");
      out.write("\t\t\t\tplotBorderWidth : null,\r\n");
      out.write("\t\t\t\tplotShadow : false\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttitle : {\r\n");
      out.write("\t\t\t\ttext : '用户角色分布'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\tpointFormat : '{series.name}: <b>{point.y}</b>'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tplotOptions : {\r\n");
      out.write("\t\t\t\tpie : {\r\n");
      out.write("\t\t\t\t\tallowPointSelect : true,\r\n");
      out.write("\t\t\t\t\tcursor : 'pointer',\r\n");
      out.write("\t\t\t\t\tdataLabels : {\r\n");
      out.write("\t\t\t\t\t\tenabled : true,\r\n");
      out.write("\t\t\t\t\t\tcolor : '#000000',\r\n");
      out.write("\t\t\t\t\t\tconnectorColor : '#000000',\r\n");
      out.write("\t\t\t\t\t\tformatter : function() {\r\n");
      out.write("\t\t\t\t\t\t\treturn '<b>' + this.point.name + '</b>角色：' + this.y + ' 人';\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\ttype : 'pie',\r\n");
      out.write("\t\t\t\tname : '用户数量：',\r\n");
      out.write("\t\t\t\tdata : []\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$.post(sy.contextPath + '/base/syrole!doNotNeedSecurity_userRoleChart.sy', function(result) {\r\n");
      out.write("\t\t\tvar trs = '';\r\n");
      out.write("\t\t\t$.each(result, function(index, item) {\r\n");
      out.write("\t\t\t\ttrs += sy.formatString('<tr><td>{0}</td><td>{1}</td></tr>', item.name, item.y);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$('table tr td table').append(trs);\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar chart = $('#container').highcharts();\r\n");
      out.write("\t\t\tchart.series[0].setData(result);\r\n");
      out.write("\r\n");
      out.write("\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<table style=\"width: 100%; height: 100%\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td style=\"width: 60%\"><div id=\"container\"></div></td>\r\n");
      out.write("\t\t\t<td valign=\"top\">\r\n");
      out.write("\t\t\t\t<table class=\"table\" style=\"margin-left: 20px;\">\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<th>角色名称</th>\r\n");
      out.write("\t\t\t\t\t\t<th>用户数量</th>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
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
