<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表 </title>
<!-- 引入静态文件, 需要在user-servlet.xml配置映射关系 
<link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/main.css" type="text/css">-->
</head>
<body>
<table width="80%" border="1">
<form action="{pageContext.request.contextPath}/goods/querygoods" method="post">
<br/>
    <tr>
    <td>商品</td>
    <td>价格</td>
    <td>数量</td>
    <td>时间</td>
    <td>描述</td>    
    </tr>
	<c:forEach items="${goods}" var="map">
	<tr>
	<td>${map.goodsname}</td>
	<td>${map.price}</td>
	<td>${map.num}</td>
	<td width="20%"><fmt:formatDate value="${map.uptime}"  pattern="yyyy-mm-dd HH:mm:ss"/></td>
	<td>${map.description}</td>
	<td> <a href="updategoods?goodsid=${map.goodsid}">修改</a></td>
	<td><a href="{pageContext.request.contextPath}/goods/deletegoods?goodsid=${map.goodsid}">删除</a></td>		
	</tr>		
	</c:forEach>
	</form>
	</table>
</body>
</html>