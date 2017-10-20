<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>hello world!</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="./css/index.css">
	
 	<script type="text/javascript" src="./js/react/react.js"></script>
	<script type="text/javascript" src="./js/react/react-dom.js"></script>
	<script type="text/javascript" src="./js/react/browser.min.js"></script>
	<script type="text/babel" src="./jsx/index.jsx"></script>
  </head>
  <body>
    <div id="baseDiv"></div>
  </body>
</html>
