package org.apache.jsp.securityJsp.base.chart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sy.util.base.SecurityUtil;

public final class userCreateDatetimeChart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\t\t\t\tfilename : '用户注册时间分布'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tchart : {\r\n");
      out.write("\t\t\t\ttype : 'column',\r\n");
      out.write("\t\t\t\tmargin : [ 50, 50, 100, 80 ]\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttitle : {\r\n");
      out.write("\t\t\t\ttext : '用户注册时间(总用户数：0)'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\txAxis : {\r\n");
      out.write("\t\t\t\tcategories : [ '00-02', '02-04', '04-06', '06-08', '08-10', '10-12', '12-14', '14-16', '16-18', '18-20', '20-22', '22-24' ],\r\n");
      out.write("\t\t\t\tlabels : {\r\n");
      out.write("\t\t\t\t\trotation : -45,\r\n");
      out.write("\t\t\t\t\talign : 'right',\r\n");
      out.write("\t\t\t\t\tstyle : {\r\n");
      out.write("\t\t\t\t\t\tfontSize : '13px',\r\n");
      out.write("\t\t\t\t\t\tfontFamily : 'Verdana, sans-serif'\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tyAxis : {\r\n");
      out.write("\t\t\t\tmin : 0,\r\n");
      out.write("\t\t\t\ttitle : {\r\n");
      out.write("\t\t\t\t\ttext : '时间段用户注册数'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tlegend : {\r\n");
      out.write("\t\t\t\tenabled : false\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\tformatter : function() {\r\n");
      out.write("\t\t\t\t\treturn '<b>' + this.x + '点</b><br/>' + '此时间段用户注册数量为: ' + this.y + '个用户';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\tdata : [],\r\n");
      out.write("\t\t\t\tdataLabels : {\r\n");
      out.write("\t\t\t\t\tenabled : true,\r\n");
      out.write("\t\t\t\t\trotation : -90,\r\n");
      out.write("\t\t\t\t\tcolor : '#FFFFFF',\r\n");
      out.write("\t\t\t\t\talign : 'right',\r\n");
      out.write("\t\t\t\t\tx : 4,\r\n");
      out.write("\t\t\t\t\ty : 10,\r\n");
      out.write("\t\t\t\t\tstyle : {\r\n");
      out.write("\t\t\t\t\t\tfontSize : '13px',\r\n");
      out.write("\t\t\t\t\t\tfontFamily : 'Verdana, sans-serif'\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t$.post(sy.contextPath + '/base/syuser!doNotNeedSecurity_userCreateDatetimeChart.sy', function(result) {\r\n");
      out.write("\t\t\t$.each(result, function(index, item) {\r\n");
      out.write("\t\t\t\t$('table tbody tr td:eq(' + index + ')').html(item);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\tvar chart = $('#container').highcharts();\r\n");
      out.write("\t\t\tchart.series[0].setData(result);\r\n");
      out.write("\t\t\tvar countUser = 0;\r\n");
      out.write("\t\t\tfor (var i = 0; i < result.length; i++) {\r\n");
      out.write("\t\t\t\tcountUser += result[i];\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\tchart.setTitle({\r\n");
      out.write("\t\t\t\ttext : '用户注册时间(总用户数：' + countUser + ')'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t}, 'json');\r\n");
      out.write("\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"container\"></div>\r\n");
      out.write("\t<div align=\"center\">\r\n");
      out.write("\t\t<table class=\"table\" style=\"font-size: x-small;\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>00点-02点</th>\r\n");
      out.write("\t\t\t\t\t<th>02点-04点</th>\r\n");
      out.write("\t\t\t\t\t<th>04点-06点</th>\r\n");
      out.write("\t\t\t\t\t<th>06点-08点</th>\r\n");
      out.write("\t\t\t\t\t<th>08点-10点</th>\r\n");
      out.write("\t\t\t\t\t<th>10点-12点</th>\r\n");
      out.write("\t\t\t\t\t<th>12点-14点</th>\r\n");
      out.write("\t\t\t\t\t<th>14点-16点</th>\r\n");
      out.write("\t\t\t\t\t<th>16点-18点</th>\r\n");
      out.write("\t\t\t\t\t<th>18点-20点</th>\r\n");
      out.write("\t\t\t\t\t<th>20点-22点</th>\r\n");
      out.write("\t\t\t\t\t<th>22点-24点</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
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
