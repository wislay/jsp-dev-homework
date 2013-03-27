<%@ page language="java" import="java.util.*" pageEncoding="utf8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String user_type = (String)session.getAttribute("utype");
if (null == user_type) {
	response.sendRedirect("/hs/login_first.jsp");
}
if (!user_type.equals("teacher")) {
	response.sendRedirect("/hs/error.jsp");
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>教师主页</title>
    
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
	<h2>当前身份：教师</h2>
	<hr />
		<table cellspacing="0px" width="450px" border="1px solid grey">
			<tr>
			<td width="%40">教师员工号</td><td><s:property value="%{#request.t_info.teacherNo}" /></td>
			</tr>
			<tr>
			<td width="%40">教师姓名</td><td><s:property value="%{#request.t_info.teacherName}" /></td>
			</tr>
			<tr>
			<td width="%40">性别</td><td>${request.t_info.teacherGender == "1"?"男":"女"}</td>
			</tr>
			<tr>
			<td width="%40">邮箱</td><td><s:property value="%{#request.t_info.teacherEmail}" /></td>
			</tr>
			<tr>
			<td width="%40">手机号码</td><td><s:property value="%{#request.t_info.teacherMobile}" /></td>
			</tr>
		</table>		
	<hr />
		<table cellspacing="0px" border="1px solid grey">
			<tr>
			<th>学期编号</th>
			<th>班级编号</th>
			<th>教室</th>
			<th>课程名称</th>
			<th>上课起始周</th>
			<th>上课终止周</th>
			<th>上课起始节数</th>
			<th>上课终止节数</th>
			</tr>
			<s:iterator value="#request.sc_info" id="sc">
				<tr>
					<td><s:property value="#sc.termNo"/></td>
					<td><s:property value="#sc.classNo"/></td>
					<td><s:property value="#sc.classroom"/></td>
					<td><s:property value="#sc.courseName"/></td>
					<td><s:property value="#sc.startWeek"/></td>
					<td><s:property value="#sc.endWeek"/></td>
					<td><s:property value="#sc.startClass"/></td>
					<td><s:property value="#sc.endClass"/></td>
				</tr>
			</s:iterator>
		</table>
	<hr />
	<table border="0px">
	<tr>
	<td><a href="change_password.jsp">修改密码</a></td>
	<td><a href="LogoutAction">退出系统</a></td>
	</tr>
	</table>
	
  </center>
  </body>
</html>
