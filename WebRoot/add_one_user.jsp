<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String user_type = (String)session.getAttribute("utype");
if (null == user_type) {
	response.sendRedirect("/hs/login_first.jsp");
}
else {
	if (!user_type.equals("admin")) {
		response.sendRedirect("/hs/error.jsp");
	}
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>增加用户</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    <h2>添加用户</h2>
    <hr />
    <s:form action="AddOneUserAction" method="Post">
    <s:textfield name="id" label="编号"></s:textfield>
    <s:textfield name="uname" label="用户名"></s:textfield>
    <s:password name="passwd" label="密码"></s:password>
    <s:textfield name="utype" label="用户类型"></s:textfield>
    <s:submit value="提交"></s:submit>
    <s:reset value="重置"></s:reset>
    </s:form>    
    <hr />
    </center>
  </body>
</html>
