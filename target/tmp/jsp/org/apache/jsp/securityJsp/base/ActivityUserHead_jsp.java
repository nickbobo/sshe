package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ActivityUserHead_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');

	String contextPath = request.getContextPath();

      out.write('\n');

	String id = request.getParameter("id");
	if (id == null) {
		id = "";
	}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title></title>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../inc.jsp", out, false);
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tvar uploader;//上传对象\n");
      out.write("\tvar submitForm = function($dialog, $grid, $pjq) {\n");
      out.write("\t\tif ($('form').form('validate')) {\n");
      out.write("\t\t\tif (uploader.files.length > 0) {\n");
      out.write("\t\t\t\tuploader.start();\n");
      out.write("\t\t\t\tuploader.bind('StateChanged', function(uploader) {// 在所有的文件上传完毕时，提交表单\n");
      out.write("\t\t\t \t\tif (uploader.files.length === (uploader.total.uploaded + uploader.total.failed)) {\n");
      out.write("\t\t\t \t\t\tparent.sy.progressBar('close');//关闭上传进度条\n");
      out.write("\t\t\t \t\t\t/* alert($('#photo')[0].src) */\n");
      out.write("\t\t\t \t\t\t\n");
      out.write("\t\t\t \t\t\tconsole.info($dialog.fileUrl);\n");
      out.write("\t\t\t \t\t\t/* $dialog.dialog('destroy'); */\n");
      out.write("\t\t\t\t\t} \n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\t/* submitNow($dialog, $grid, $pjq); */\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t};\n");
      out.write("\t$(function() {\n");
      out.write("\n");
      out.write("/* \t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\n");
      out.write("\t\t\tparent.$.messager.progress({\n");
      out.write("\t\t\t\ttext : '数据加载中....'\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/syuser!getById.sy', {\n");
      out.write("\t\t\t\tid : $(':input[name=\"data.id\"]').val()\n");
      out.write("\t\t\t}, function(result) {\n");
      out.write("\t\t\t\tif (result.id != undefined) {\n");
      out.write("\t\t\t\t\t$('form').form('load', {\n");
      out.write("\t\t\t\t\t\t'data.id' : result.id,\n");
      out.write("\t\t\t\t\t\t'data.name' : result.name,\n");
      out.write("\t\t\t\t\t\t'data.loginname' : result.loginname,\n");
      out.write("\t\t\t\t\t\t'data.sex' : result.sex,\n");
      out.write("\t\t\t\t\t\t'data.age' : result.age,\n");
      out.write("\t\t\t\t\t\t'data.photo' : result.photo\n");
      out.write("\t\t\t\t\t});\n");
      out.write("\t\t\t\t\tif (result.photo) {\n");
      out.write("\t\t\t\t\t\t$('#photo').attr('src', sy.contextPath + result.photo);\n");
      out.write("\t\t\t\t\t}\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\n");
      out.write("\t\t\t}, 'json');\n");
      out.write("\t\t} */\n");
      out.write("\n");
      out.write("\t\tuploader = new plupload.Uploader({//上传插件定义\n");
      out.write("\t\t\tbrowse_button : 'pickfiles',//选择文件的按钮\n");
      out.write("\t\t\tcontainer : 'container',//文件上传容器\n");
      out.write("\t\t\truntimes : 'html5,flash',//设置运行环境，会按设置的顺序，可以选择的值有html5,gears,flash,silverlight,browserplus,html4\n");
      out.write("\t\t\tflash_swf_url : sy.contextPath + '/jslib/plupload_1_5_7/plupload/js/plupload.flash.swf',// Flash环境路径设置\n");
      out.write("\t\t\turl : sy.contextPath + '/plupload?fileFolder=/userPhoto',//上传文件路径\n");
      out.write("\t\t\tmax_file_size : '5mb',//100b, 10kb, 10mb, 1gb\n");
      out.write("\t\t\tchunk_size : '10mb',//分块大小，小于这个大小的不分块\n");
      out.write("\t\t\tunique_names : true,//生成唯一文件名\n");
      out.write("\t\t\t// 如果可能的话，压缩图片大小\n");
      out.write("\t\t\t/*resize : {\n");
      out.write("\t\t\t\twidth : 320,\n");
      out.write("\t\t\t\theight : 240,\n");
      out.write("\t\t\t\tquality : 90\n");
      out.write("\t\t\t},*/\n");
      out.write("\t\t\t// 指定要浏览的文件类型\n");
      out.write("\t\t\tfilters : [ {\n");
      out.write("\t\t\t\ttitle : '图片文件',\n");
      out.write("\t\t\t\textensions : 'jpg,gif,png'\n");
      out.write("\t\t\t} ]\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('Init', function(up, params) {//初始化时\n");
      out.write("\t\t\t//$('#filelist').html(\"<div>当前运行环境: \" + params.runtime + \"</div>\");\n");
      out.write("\t\t\t$('#filelist').html(\"\");\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('BeforeUpload', function(uploader, file) {//上传之前\n");
      out.write("\t\t\tif (uploader.files.length > 1) {\n");
      out.write("\t\t\t\tparent.$.messager.alert('提示', '只允许选择一张照片！', 'error');\n");
      out.write("\t\t\t\tuploader.stop();\n");
      out.write("\t\t\t\treturn;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('.ext-icon-cross').hide();\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('FilesAdded', function(up, files) {//选择文件后\n");
      out.write("\t\t\t$.each(files, function(i, file) {\n");
      out.write("\t\t\t\t$('#filelist').append('<div id=\"' + file.id + '\">' + file.name + '(' + plupload.formatSize(file.size) + ')<strong></strong>' + '<span onclick=\"uploader.removeFile(uploader.getFile($(this).parent().attr(\\'id\\')));$(this).parent().remove();\" style=\"cursor:pointer;\" class=\"ext-icon-cross\" title=\"删除\">&nbsp;&nbsp;&nbsp;&nbsp;</span></div>');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\tup.refresh();\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('UploadProgress', function(up, file) {//上传进度改变\n");
      out.write("\t\t\tvar msg;\n");
      out.write("\t\t\tif (file.percent == 100) {\n");
      out.write("\t\t\t\tmsg = '99';//因为某些大文件上传到服务器需要合并的过程，所以强制客户看到99%，等后台合并完成...\n");
      out.write("\t\t\t} else {\n");
      out.write("\t\t\t\tmsg = file.percent;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t$('#' + file.id + '>strong').html(msg + '%');\n");
      out.write("\n");
      out.write("\t\t\tparent.sy.progressBar({//显示文件上传滚动条\n");
      out.write("\t\t\t\ttitle : '文件上传中...',\n");
      out.write("\t\t\t\tvalue : msg\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('Error', function(up, err) {//出现错误\n");
      out.write("\t\t \t$('#filelist').append(\"<div>错误代码: \" + err.code + \", 描述信息: \" + err.message + (err.file ? \", 文件名称: \" + err.file.name : \"\") + \"</div>\");\n");
      out.write("\t\t\tup.refresh(); \n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.bind('FileUploaded', function(up, file, info) {//上传完毕\n");
      out.write(" \t\t\tvar response = $.parseJSON(info.response);\n");
      out.write("\t\t\tconsole.info(response);\n");
      out.write("\t\t\tparent.sy.progressBar('close');//关闭上传进度条\n");
      out.write("\t\t\t$('#photo').attr('src',\"/sshe\"+response.fileUrl); \n");
      out.write("\t\t\tif (response.status) {\n");
      out.write("\t\t\t\t$('#' + file.id + '>strong').html(\"100%\");\n");
      out.write("\t\t\t\t$('#f1').append('<input type=\"hidden\" name=\"fileUrl\" value=\"'+response.fileUrl+'\"/>');\n");
      out.write("\t\t\t\t$('#f1').append('<input type=\"hidden\" name=\"fileName\" value=\"'+file.name+'\"/><br/>');\n");
      out.write("\t\t\t\t$(':input[name=\"data.photo\"]').val(response.fileUrl);\n");
      out.write("\t\t\t} \n");
      out.write("\t\t\tuploader.files=[];\n");
      out.write("\t\t});\n");
      out.write("\t\tuploader.init();\n");
      out.write("\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<form method=\"post\" class=\"form\">\n");
      out.write("\t\t<fieldset>\n");
      out.write("\t\t\t<legend>用户头像上传</legend>\n");
      out.write("\t\t\t<table class=\"table\" style=\"width: 100%;\">\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<th>照片上传</th>\n");
      out.write("\t\t\t\t\t<td><div id=\"container\">\n");
      out.write("\t\t\t\t\t\t\t<a id=\"pickfiles\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-zoom'\">选择文件</a>\n");
      out.write("\t\t\t\t\t\t\t<div id=\"filelist\">您的浏览器没有安装Flash插件，或不支持HTML5！</div>\n");
      out.write("\t\t\t\t\t\t</div></td>\n");
      out.write("\t\t\t\t\t<th></th>\n");
      out.write("\t\t\t\t\t<td><input name=\"data.photo\" readonly=\"readonly\"  /> <img id=\"photo\" src=\"/sshe/ssheUploadFile/userPhoto/2017/06/01/009b3eb7ddca45babe87af5feb819631.jpg\" style=\"width: 200px; height: 200px;\"></td>\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t</fieldset>\n");
      out.write("\t</form>\n");
      out.write("</body>\n");
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
