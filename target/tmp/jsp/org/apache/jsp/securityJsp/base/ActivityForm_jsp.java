package org.apache.jsp.securityJsp.base;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ActivityForm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\r');
      out.write('\n');

	String id = request.getParameter("id");
	if (id == null) {
		id = "";
	}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title></title>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../inc.jsp", out, false);
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("#filelist{\r\n");
      out.write("width: 100px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("var grid;\r\n");
      out.write("var uploader;//上传对象\r\n");
      out.write("\r\n");
      out.write("var submitNow = function($dialog, $grid, $pjq) {\r\n");
      out.write("\tvar data = sy.serializeObject($('form')); \r\n");
      out.write("\tvar url;\r\n");
      out.write("\tif ($(':input[name=\"data.id\"]').val().length > 0) { \r\n");
      out.write("\t\turl = sy.contextPath + '/base/activity!update.sy';\r\n");
      out.write("\t} \r\n");
      out.write("\telse {\r\n");
      out.write("\t\turl = sy.contextPath + '/base/activity!save.sy';\r\n");
      out.write("\t}\r\n");
      out.write("\t$.post(url, data, function(result) {\r\n");
      out.write("\t\tif (result.success) {\r\n");
      out.write("\t\t\tparent.sy.progressBar('close');//关闭上传进度\r\n");
      out.write("\t\t\t$grid.datagrid('reload');\r\n");
      out.write("\t\t\t$dialog.dialog('destroy');\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\t$pjq.messager.alert('提示', result.msg, 'error');\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}, 'json');\r\n");
      out.write("};\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var submitForm = function($dialog, $grid, $pjq) {\r\n");
      out.write("\tif ($('form').form('validate')) {\r\n");
      out.write("\t\tif (uploader.files.length > 0 ) {\r\n");
      out.write("\t\t\tuploader.start();\r\n");
      out.write("\t\t\tuploader.bind('StateChanged', function(uploader) {// 在所有的文件上传完毕时，提交表单\r\n");
      out.write("\t\t \t\tif (uploader.files.length === (uploader.total.uploaded + uploader.total.failed)) {\r\n");
      out.write("\t\t \t\t\tsubmitNow($dialog, $grid, $pjq);\r\n");
      out.write("\t\t\t\t} \r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t} else {\r\n");
      out.write("\t\t\tsubmitNow($dialog, $grid, $pjq);\r\n");
      out.write("\t\t}\r\n");
      out.write("\t } \r\n");
      out.write("};\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("/* \tvar showIcons = function() {\r\n");
      out.write("\t\tvar dialog = parent.sy.modalDialog({\r\n");
      out.write("\t\t\ttitle : '浏览小图标',\r\n");
      out.write("\t\t\turl : sy.contextPath + '/style/icons.jsp',\r\n");
      out.write("\t\t\tbuttons : [ {\r\n");
      out.write("\t\t\t\ttext : '确定',\r\n");
      out.write("\t\t\t\thandler : function() {\r\n");
      out.write("\t\t\t\t\tdialog.find('iframe').get(0).contentWindow.selectIcon(\r\n");
      out.write("\t\t\t\t\t\t\tdialog, $('#iconCls'));\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}; */\r\n");
      out.write("\t$(function() {\r\n");
      out.write(" \t\tif ($(':input[name=\"data.id\"]').val().length > 0) {\r\n");
      out.write("\t\t\tparent.$.messager.progress({\r\n");
      out.write("\t\t\t\ttext : '数据加载中....'\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t$.post(sy.contextPath + '/base/activity!getById.sy',\r\n");
      out.write("\t\t\t{\r\n");
      out.write("\t\t\t\tid : $(':input[name=\"data.id\"]').val()\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tfunction(result) {\r\n");
      out.write("\t\t\t\tif (result.id != undefined) {\r\n");
      out.write("\t\t\t\t\t$('form').form('load',{\r\n");
      out.write("\t\t\t\t\t\t'data.id' : result.id,\r\n");
      out.write("\t\t\t\t\t\t'data.name' : result.name,\r\n");
      out.write("\t\t\t\t\t\t//'data.nickname' : result.nickname,\r\n");
      out.write("\t\t\t\t\t\t'data.url' : result.url,\r\n");
      out.write("\t\t\t\t\t\t//'data.syorganization.id' : result.syorganization ? result.syorganization.id\r\n");
      out.write("\t\t\t\t\t\t//\t\t: '',\r\n");
      out.write("\t\t\t\t\t\t//'data.iconCls' : result.iconCls,\r\n");
      out.write("\t\t\t\t\t\t'data.seq' : result.seq,\r\n");
      out.write("\t\t\t\t\t\t'data.code' : result.code\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\tconsole.info(result.headurl);\r\n");
      out.write("\t\t\t\t\t$('#photo').attr('src',result.url); \r\n");
      out.write("\t\t\t\t\t$('#iconCls').attr('class', result.iconCls); //设置背景图标\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\tparent.$.messager.progress('close');\r\n");
      out.write("\t\t\t}, 'json');\r\n");
      out.write("\t\t} \r\n");
      out.write("\r\n");
      out.write("\t\t//图片上传\r\n");
      out.write("\r\n");
      out.write("\t\tuploader = new plupload.Uploader({ //上传插件定义\r\n");
      out.write("\t\t\tbrowse_button : 'pickfiles', //选择文件的按钮\r\n");
      out.write("\t\t\tcontainer : 'container', //文件上传容器\r\n");
      out.write("\t\t\truntimes : 'html5,flash', //设置运行环境，会按设置的顺序，可以选择的值有html5,gears,flash,silverlight,browserplus,html4\r\n");
      out.write("\t\t\tflash_swf_url : sy.contextPath\r\n");
      out.write("\t\t\t\t\t+ '/jslib/plupload_1_5_7/plupload/js/plupload.flash.swf', // Flash环境路径设置\r\n");
      out.write("\t\t\turl : sy.contextPath + '/plupload?fileFolder=/userPhoto', //上传文件路径\r\n");
      out.write("\t\t\tmax_file_size : '5mb', //100b, 10kb, 10mb, 1gb\r\n");
      out.write("\t\t\tchunk_size : '10mb', //分块大小，小于这个大小的不分块\r\n");
      out.write("\t\t\tunique_names : true, //生成唯一文件名\r\n");
      out.write("\t\t\t// 如果可能的话，压缩图片大小\r\n");
      out.write("\t\t\t/*resize : {\r\n");
      out.write("\t\t\t\twidth : 320,\r\n");
      out.write("\t\t\t\theight : 240,\r\n");
      out.write("\t\t\t\tquality : 90\r\n");
      out.write("\t\t\t},*/\r\n");
      out.write("\t\t\t// 指定要浏览的文件类型\r\n");
      out.write("\t\t\tfilters : [ {\r\n");
      out.write("\t\t\t\ttitle : '图片文件',\r\n");
      out.write("\t\t\t\textensions : 'jpg,gif,png'\r\n");
      out.write("\t\t\t} ]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('Init', function(up, params) { //初始化时\r\n");
      out.write("\t\t\t//$('#filelist').html(\"<div>当前运行环境: \" + params.runtime + \"</div>\");\r\n");
      out.write("\t\t\t$('#filelist').html(\"\");\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('BeforeUpload', function(uploader, file) { //上传之前\r\n");
      out.write("\t\t\tif (uploader.files.length > 1) {\r\n");
      out.write("\t\t\t\tparent.$.messager.alert('提示', '只允许选择一张照片！', 'error');\r\n");
      out.write("\t\t\t\tuploader.stop();\r\n");
      out.write("\t\t\t\treturn;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('.ext-icon-cross').hide();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind(\r\n");
      out.write("\t\t\t\t\t\t'FilesAdded',\r\n");
      out.write("\t\t\t\t\t\tfunction(up, files) { //选择文件后\r\n");
      out.write("\t\t\t\t\t\t\t$.each(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfiles,\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tfunction(i, file) {\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t$('#filelist').append(\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t'<div id=\"' + file.id + '\">'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ file.name\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '('\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ plupload.formatSize(file.size)\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ ')<strong></strong>'\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t+ '<span onclick=\"uploader.removeFile(uploader.getFile($(this).parent().attr(\\'id\\')));$(this).parent().remove();\" style=\"cursor:pointer;\" class=\"ext-icon-cross\" title=\"删除\">&nbsp;&nbsp;&nbsp;&nbsp;</span></div>');\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\t\t\tup.refresh();\r\n");
      out.write("\t\t\t\t\t\t});\r\n");
      out.write("\t\tuploader.bind('UploadProgress', function(up, file) { //上传进度改变\r\n");
      out.write("\t\t\tvar msg;\r\n");
      out.write("\t\t\tif (file.percent == 100) {\r\n");
      out.write("\t\t\t\tmsg = '99'; //因为某些大文件上传到服务器需要合并的过程，所以强制客户看到99%，等后台合并完成...\r\n");
      out.write("\t\t\t} else {\r\n");
      out.write("\t\t\t\tmsg = file.percent;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t$('#' + file.id + '>strong').html(msg + '%');\r\n");
      out.write("\r\n");
      out.write("\t\t\tparent.sy.progressBar({ //显示文件上传滚动条\r\n");
      out.write("\t\t\t\ttitle : '文件上传中...',\r\n");
      out.write("\t\t\t\tvalue : msg\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('Error', function(up, err) { //出现错误\r\n");
      out.write("\t\t\t$('#filelist').append(\r\n");
      out.write("\t\t\t\t\t\"<div>错误代码: \" + err.code + \", 描述信息: \" + err.message\r\n");
      out.write("\t\t\t\t\t\t\t+ (err.file ? \", 文件名称: \" + err.file.name : \"\")\r\n");
      out.write("\t\t\t\t\t\t\t+ \"</div>\");\r\n");
      out.write("\t\t\tup.refresh();\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.bind('FileUploaded', function(up, file, info) { //上传完毕\r\n");
      out.write("\t\t\tvar response = $.parseJSON(info.response);\r\n");
      out.write("\t\t\t$(\".photo\").val((\"/sshe\"+response.fileUrl));\r\n");
      out.write("\t\t\t$('#photo').attr('src',\"/sshe\"+response.fileUrl); \r\n");
      out.write("\t\t\tif (response.status) {\r\n");
      out.write("\t\t\t\t$('#' + file.id + '>strong').html(\"100%\");\r\n");
      out.write("\t\t\t\t//console.info(response.fileUrl);\r\n");
      out.write("\t\t\t\t//console.info(file.name);\r\n");
      out.write("\t\t\t\t//$('#f1').append('<input type=\"hidden\" name=\"fileUrl\" value=\"'+response.fileUrl+'\"/>');\r\n");
      out.write("\t\t\t\t//$('#f1').append('<input type=\"hidden\" name=\"fileName\" value=\"'+file.name+'\"/><br/>');\r\n");
      out.write("\t\t\t\t$(':input[name=\"data.photo\"]').val(response.fileUrl);\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\tuploader.init();\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<form method=\"post\" class=\"form\">\r\n");
      out.write("\t\t<fieldset>\r\n");
      out.write("\t\t\t<legend>活动基本信息</legend>\r\n");
      out.write("\t\t\t<table class=\"table\" style=\"width: 100%;\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>编号</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.id\" value=\"");
      out.print(id);
      out.write("\" readonly=\"readonly\" />\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t<!-- \t<tr>\r\n");
      out.write("\t\t\t\t\t<th>登录名</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.nickname\" class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>活动名</th>\r\n");
      out.write("\t\t\t\t\t<td><input name=\"data.name\" class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"required:true\" /></td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("<!-- \t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>性别</th>\r\n");
      out.write("\t\t\t\t\t<td><select class=\"easyui-combobox\" name=\"data.sex\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"panelHeight:'auto',editable:false\"\r\n");
      out.write("\t\t\t\t\t\tstyle=\"width: 155px;\">\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"1\">男</option>\r\n");
      out.write("\t\t\t\t\t\t\t<option value=\"0\">女</option>\r\n");
      out.write("\t\t\t\t\t</select></td>\r\n");
      out.write("\t\t\t\t</tr> -->\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th>活动图片上传</th>\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t <input name=\"data.url\" readonly=\"readonly\" style=\"display: none;\" class = \"photo\" class=\"easyui-validatebox\"\r\n");
      out.write("\t\t\t\t\t\tdata-options=\"required:true\" />\r\n");
      out.write("\t\t\t\t\t<img id=\"photo\" src=\"/sshe/ssheUploadFile/userPhoto/2017/06/01/009b3eb7ddca45babe87af5feb819631.jpg\" style=\" height: 200px;\">\r\n");
      out.write("\t\t\t\t\t</td><td>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div id=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t<a id=\"pickfiles\" href=\"javascript:void(0);\" class=\"easyui-linkbutton\" data-options=\"iconCls:'ext-icon-zoom'\">选择文件</a>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"filelist\">您的浏览器没有安装Flash插件，或不支持HTML5！</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</fieldset>\r\n");
      out.write("\t</form>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
