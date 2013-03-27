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
    
    <title>编辑课表信息</title>
    
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
	<h2>当前身份：管理员[修改课表记录]</h2>
	<hr />
	<s:form action="EditCurriculumInfoAction" mothod="Post">
		<table cellspacing="0px" width="450px" border="1px solid grey">
			<tr>
			<td><s:textfield label="记录号" name="listNo" value="%{#request.one_cr.listNo}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="学期编号" name="termNo" value="%{#request.one_cr.termNo}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="教师员工号" name="teacherNo" value="%{#request.one_cr.teacherNo}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="班级编号" name="classNo" value="%{#request.one_cr.classNo}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="教室" name="classroom" value="%{#request.one_cr.classroom}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="课程编号" name="courseNo" value="%{#request.one_cr.courseNo}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="上课起始周" name="startWeek" value="%{#request.one_cr.startWeek}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="上课终止周" name="endWeek" value="%{#request.one_cr.endWeek}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="上课起始节数" name="startClass" value="%{#request.one_cr.startClass}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="上课终止节数" name="endClass" value="%{#request.one_cr.endClass}"></s:textfield></td>
			</tr>
		</table>
		<s:submit value="提交"></s:submit>
    	<s:reset value="重置"></s:reset>
	</s:form>		
	<hr />
	
  </center>
  </body>
</html>
