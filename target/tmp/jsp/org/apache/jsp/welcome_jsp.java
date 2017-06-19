package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String contextPath = request.getContextPath();

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<title>欢迎页面</title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "inc.jsp", out, false);
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style = \"font-size:20px\">\r\n");
      out.write("\tSSHE示例项目是一个由Eclipse Kepler创建，<br/><br/>\r\n");
      out.write("\tStruts2.3.x+Spring3.2.x+Hibernate4.2.x+CXF2.7.x+EasyUI1.3.4+Maven架构的示例程序<br/><br/>\r\n");
      out.write("\t当前示例演示了包括：权限控制、超大附件文件上传、EasyUI基本组件使用等等功能，具体请自行看本示例演示功能<br/><br/>\r\n");
      out.write("\tSSHE框架环境需求：JAVA环境：JDK7+；<br/><br/>\r\n");
      out.write("\t数据库环境：oracle10g+/sqlserver2000+/mysql5+；<br/><br/>\r\n");
      out.write("\tWEB容器环境：jetty6+/tomcat6+；<br/><br/>\r\n");
      out.write("\t编译环境：maven：3.x+ <br/><br/>\r\n");
      out.write("\t<hr />\r\n");
      out.write("\r\n");
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
