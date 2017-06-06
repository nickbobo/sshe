<%@ WebHandler Language="c#" Class="File_WebHandler" Debug="true" %>

using System;
using System.Web;
using System.IO;

public class File_WebHandler : IHttpHandler
{
    public void ProcessRequest(HttpContext context)
    {
        if (context.Request.Files.Count > 0)
        {
            HttpPostedFile file = context.Request.Files[0];
            if (file.ContentLength > 0 || !string.IsNullOrEmpty(file.FileName))
            {
                string _msg = "文件属性";
                _msg += "\\n\\n文件名：" + Path.GetFileName(file.FileName)
                    + "\\n\\n后缀名：" + Path.GetExtension(file.FileName)
                    + "\\n\\n文件长度：" + file.ContentLength + " 字节"
                    + "\\n\\n文件类型：" + file.ContentType;

                context.Response.Write("<script>alert('" + _msg + "');</script>");
            }
        }
    }
    
    public bool IsReusable
    {
        get
        {
            return false;
        }
    }
}