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
    
    <title>管理员主页</title>
    
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
	<h2>当前身份：管理员</h2>		
	<hr />
		<table cellspacing="0px" border="1px solid grey">
			<tr>
			<th>记录号</th>
			<th>学期编号</th>
			<th>教师编号</th>
			<th>班级编号</th>
			<th>教室</th>
			<th>课程编号</th>
			<th>上课起始周</th>
			<th>上课终止周</th>
			<th>上课起始节数</th>
			<th>上课终止节数</th>
			</tr>
			<s:iterator value="#request.cr_info" id="cr">
				<tr>
					<td><s:property value="#cr.listNo"/></td>
					<td><s:property value="#cr.termNo"/></td>
					<td><s:property value="#cr.teacherNo"/></td>
					<td><s:property value="#cr.classNo"/></td>
					<td><s:property value="#cr.classroom"/></td>
					<td><s:property value="#cr.courseNo"/></td>
					<td><s:property value="#cr.startWeek"/></td>
					<td><s:property value="#cr.endWeek"/></td>
					<td><s:property value="#cr.startClass"/></td>
					<td><s:property value="#cr.endClass"/></td>
					<td><a href="DeleteOneCurriculumAction?listNo=<s:property value='#cr.listNo'/>">删除</a></td>
					<td><a href="ShowOneCurriculumForEdit?listNo=<s:property value='#cr.listNo'/>">修改</a></td>
				</tr>
			</s:iterator>
		</table>
	<hr />
	<table border="0px">
	<tr>
	<td><a href="change_password.jsp">修改密码</a></td>
	<td><a href="add_one_curriculum.jsp">增加课表</a></td>
	<td><a href="ShowAllUser">显示所有用户</a></td>
	<td><a href="LogoutAction">退出系统</a></td>
	</tr>
	</table>
	
  </center>
  </body>
</html>
