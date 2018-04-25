
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>
<!-- 如没写action, 也会提交给add(匹配文件名) -->
<sf:form method="post" modelAttribute="user" action="add">
	user:<sf:input path="username"/><sf:errors path="username"/><br/>
	Password:<sf:password path="password"/><sf:errors path="password"/><br/>
	<input type="submit" value="添加用户"/>
</sf:form>
</body>
</html>