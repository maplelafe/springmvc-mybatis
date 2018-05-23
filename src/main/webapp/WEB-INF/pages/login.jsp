<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- ${pageContext.request.contextPath }/ -->
<html>
<head><title>用户登录</title></head>
<body>

<form action="${pageContext.request.contextPath }/login" method="post">
	用户名：<input type="text" name="username"/><br/>
	密码 ：<input type="password" name="password"/><br/>
	<input type="submit" value="登录"/>
</form>
</body>
</html>
