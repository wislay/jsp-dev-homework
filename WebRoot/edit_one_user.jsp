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
    
    <title>编辑用户</title>
    
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
    <h2>编辑用户</h2>
    <hr />
    	<s:form action="EditOneUserAction" method="Post">
    		<s:textfield name="id" label="编号" value="%{#request.one.id}"></s:textfield>
    		<s:textfield name="uname" label="用户名" value="%{#request.one.uname}"></s:textfield>
    		<s:textfield name="passwd" label="密码" value="%{#request.one.passwd}"></s:textfield>
    		<s:textfield name="utype" label="用户类型" value="%{#request.one.utype}"></s:textfield>
    		<s:submit value="提交"></s:submit>
    		<s:reset value="重置"></s:reset>
    	</s:form>
    <hr />
    </center>
  </body>
</html>
