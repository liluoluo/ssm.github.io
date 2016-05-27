<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" href="./css/login/login.css"/>
<script type="text/javascript" src="./js/utils/jquery-1.12.2.min.js"></script>
<script type="text/javascript" src="./js/utils/javaJsCommonDes.js"></script>
<script type="text/javascript" src="./js/utils/utils.js"></script>
<script type="text/javascript" src="./js/login/login.js"></script>
<title>login</title>
</head>
<body>
	<h2>欢迎登陆</h2>
	<p>账号：<input type="text" id="login_account" /></p>
	<p>密码：<input type="text" id="login_passWord"/></p>
	<p><input type="button" value="登陆" id="long_button"/></p>
</body>
</html>
