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
	
  <script type="text/javascript" src="/ssm_4_4/statics/js/jquery-1.12.4.js"></script>
  <script>
  		$(function(){
  			show();
  		});
  		function show(){
  			$.ajax({
  				"url":"student/getAll",
  				"type":"post",
  				"dataType":"json",
  				"success":function(result){
  					$("#box").html("");
  					$(result).each(function(){
  						$("#box").append("<li>"+this.name+"-----"+this.age+"|<a href='javascript:void(0)' onclick='del("+this.id+")'>刪除</a>|<a href='student/upd1/"+this.id+"'>修改</a></li>");
  					});
  				}
  			});
  		}
  		function del(id){
  			var flag=confirm("確定要刪除吗？");
  			if(flag){
  				$.ajax({
	  				"url":"student/del/"+id,
	  				"type":"post",
	  				"dataType":"json",
	  				"success":function(result){
	  					if(result>0){
		  					alert("刪除成功");
	  					}else{
	  						alert("刪除失败");
	  					}
	  					show();
	  				}
  				});
  			}
  		}
  </script>
  </head>
  
  <body>
  		<a href="student/toAdd">添加</a>
    	<ul id="box"></ul>
  </body>
</html>
