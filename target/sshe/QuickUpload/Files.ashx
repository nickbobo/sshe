<%@ WebHandler Language="c#" Class="File_WebHandler" Debug="true" %>

using System;
using System.Web;
using System.IO;
using System.Text.RegularExpressions;

public class File_WebHandler : IHttpHandler
{
    public void ProcessRequest(HttpContext context)
    {
        HttpFileCollection files = context.Request.Files;
        if (files.Count > 0)
        {
            string[] titles = context.Request.Form["title"].Split(',');

            for (int i = 0; i < files.Count; i++)
            {
                HttpPostedFile file = files[i];

                if (file.ContentLength > 0)
                {
                    string title = titles[i].Trim();
                    if (string.IsNullOrEmpty(title))
                    {
                        title = Path.GetFileName(file.FileName);
                    }
                    else
                    {
                        title = Regex.Replace(title, @"[\\/:*?""<>|]", "");
                        title += Path.GetExtension(file.FileName);
                    }
                    
                    string path = "./file/" + title;
                    file.SaveAs(System.Web.HttpContext.Current.Server.MapPath(path));
                    context.Response.Write("{ path: \"" + path + "\", name: \"" + title + "\" }");
                }
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