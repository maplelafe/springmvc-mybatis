<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<!--<jsp:useBean id="command" class="com.peny.po.Goods" scope="request"></jsp:useBean>-->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>修改用户</title>
</head>
<body>
<!-- 如没写action, 也会提交给update(匹配文件名) -->
<sf:form id = "goodform" method="post"  modelAttribute="good" action="updategoodssubmit">
	<sf:hidden path="goodsid"/>	
	goodsname:<sf:input path="goodsname"/><sf:errors path="goodsname"/><br/>
	price:<sf:input  path="price"/><sf:errors path="price"/><br/>
	num:<sf:input path="num"/><sf:errors path="num"/><br/>
	<!-- uptime:<fmt:formatDate value='${good.uptime}' type='date' pattern='yyyy-MM-dd'/> -->
	num:<sf:input path="uptime" /><sf:errors path="uptime"/><br/>
	category:<sf:input path="category"/><sf:errors path="category"/><br/>
	decription:<sf:textarea cols="50%"  path="description"/><br/>
	activity:<sf:input path="activityid"/>
	<input type="submit" value="保存"/>
</sf:form>
</body>
</html>