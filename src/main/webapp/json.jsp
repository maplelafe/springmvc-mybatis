<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSON测试</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">

	function requestJson(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/requestJson',
			contentType:'application/json;charset=utf-8',
			data:'{"name":"手机","price":999}',
			success:function(data){
				alert(data);
			}
		})
	}
	//key/value
	function responseJson(){
		$.ajax({
			type:'post',
			url:'${pageContext.request.contextPath}/responseJson',
			data:'name=手机&price=999',
			success:function(data){
				alert(data);
			}
		})
	}
</script>
</head>
<body>
<input type="button" onclick="requestJson()" name="requestJson" value="requestJson"></input>
<input type="button" onclick="responseJson()" name="responseJson" value="responseJson"></input>
</body>
</html>