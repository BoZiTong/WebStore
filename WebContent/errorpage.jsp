<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ page import="java.io.*" %>
<%@ page isErrorPage="true" %>
<html>
<head>
<title>ErrorPage</title>
</head>
<body>
<%@include file="header.jsp" %>
	<p>
		服务器端发生错误:<%=exception.getMessage() %>
	</p>
	<p>
		错误原因为:<%exception.printStackTrace(new PrintWriter(out)); %>
		<%@include file="footer.jsp" %>
</body>
</html>