<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>jsonp测试</title>
<jsp:include page="../inc.jsp"></jsp:include>
<script type="text/javascript">
	alert("2222");
	$(function() {
		$.ajax({
			type : "post",
			url : "http://112.74.79.165:8080/sshe/demo/jsonp.js",
			dataType : "jsonp",
			jsonp : "callback",//传递给请求处理程序或页面的，用以获得jsonp回调函数名的参数名(一般默认为:callback)
			jsonpCallback : "flightHandler",//自定义的jsonp回调函数名称，默认为jQuery自动生成的随机函数名，也可以写"?"，jQuery会自动为你处理数据
			success : function(json) {
				alert('您查询到航班信息：票价： ' + json.price + ' 元，余票： ' + json.tickets + ' 张。');
			},
			error : function() {
				alert('fail');
			}
		});
	});
</script>
</head>
<body>
</body>
</html>