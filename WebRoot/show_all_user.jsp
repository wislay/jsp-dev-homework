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
    
    <title>显示用户</title>
    
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
	<h2>用户列表</h2>
	<hr />
		<table cellspacing="0px" width="450px" border="1px solid grey">
			<tr>
				<th>编号</th>
				<th>姓名</th>
				<th>类型</th>
				<th>删除</th>
				<th>更新</th>
			</tr>
			<s:iterator value="#request.all" id="User">
				<tr>
					<td ><s:property value="#User.id"/></td>
					<td><s:property value="#User.uname"/></td>
					<td>${User.utype == 1 ? "学生" : (User.utype == 2 ? "老师" : User.utype == 3 ? "管理员" : "其他")}</td>
					<td><a href="DeleteOneUserAction?id=<s:property value='#User.id'/>">删除</a></td>
					<td><a href="ShowOneUserForEdit?id=<s:property value='#User.id'/>">修改</a></td>
				</tr>
			</s:iterator>
		</table>		
	<hr />
	<td><a href="add_one_user.jsp">增加用户</a></td>
  </center>
  </body>
</html>
