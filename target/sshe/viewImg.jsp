<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@page import="sy.util.base.*"%>
<%
ImagePreview img = new ImagePreview();
out.write(img.ProcessRequest(request));
%>

