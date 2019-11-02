<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		span{
			color:red;
			font-size:15px;
		}
	</style>
  <script type="text/javascript" src="/ssm_4_4/statics/js/jquery-1.12.4.js"></script>
  <script>
  		function sub(){
  			var name=$("input[name='name']").val();
  			var age=$("input[name='age']").val();
  			$("#name").text("");
  			$("#age").text("");
  			if(name==""){
  				$("#name").text("用户名不能为空");
  				return false;
  			}
  			if(age==""){
  				$("#age").text("年龄不能为空");
  				return false;
  			}
  			$.ajax({
  				"url":"student/upd2",
  				"data":"name="+name+"&age="+age+"&id="+$("input[name='id']").val(),
  				"type":"post",
  				"dataType":"json",
  				"success":function(result){
  					if(result>0){
  						location.href="student/toWelcome";
  					}
  				}
  			});
  			return false;
  		}
  </script>
  </head>
  
  <body>
  		<h1>修改</h1>
  		<form method="post" onsubmit="return sub()">
  			<input type="hidden" name="id" value="${stu.id }">
  			学生姓名：<input name="name" value="${stu.name }"><span id="name"></span><br>
  			学生年龄：<input name="age" value="${stu.age }"><span id="age"></span><br>
  			<input type="submit">
  		</form>
  </body>
</html>



