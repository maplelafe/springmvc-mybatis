<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>修改用户</title>
</head>
<body><form id = "goodform"  method="post"  action="updategoodssubmit">
<table width="80%"  border="1">

	 <tr><td></td><td><input type="hidden" name="goodsid" value="${good.goodsid} "></td></tr>	
	<tr><td>商品名称:</td><td><input type="text" name="goodsname" value="${good.goodsname} "/></td></tr>
	<tr><td>价格:</td><td><input type="text" name="price" value="${good.price}"/></td></tr>
	<tr><td>num:</td><td><input type="text" name="num" value="${good.num }"/></td></tr>
	<tr><td>uptime:</td><td><input type="text" name="uptime"  value="<fmt:formatDate value="${good.uptime}"   pattern="yyyy-MM-dd HH:mm:ss"/>"/></td></tr>
	<tr><td>category:</td><td><input type="text" name="category" value="${good.category }"/></td></tr>
	<tr><td>detailcate:</td><td><input type="text"   name="detailcate" value="${good.detailcate }"/></td></tr>
	<tr><td>decription:</td><td><input type="text"   name="description" value="${good.description }"/>	</td></tr>
	<tr><td>activity:</td><td><input type="text" name="activityid" value="${good.activityid }"/></td></tr>
    <input type="submit" value="保存"/>
</table>
</form>
</body>
</html>