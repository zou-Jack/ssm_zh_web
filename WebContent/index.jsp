<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String appPath = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页-SSM_整合javaweb版_qxb</title>
<style type="text/css">
body {text-align:center}
h2 {color:red}
</style>
</head>
<body>

<h2>SSM_整合之普通javaweb版--整合示例</h2>
	简单的查询数据库功能
	<br /> 日期：2018-02-07 
	<br /> 作者：Zoutao
	<br /> 博客：
	<a href="http://blog.csdn.net/ITBigGod" target="_blank">柒晓白</a>
	<br />
	<br />
	<br />
	<br /> 数据库数据查看：
	<a href="<%=appPath%>/listCategory">点击前往</a>
</body>
</html>