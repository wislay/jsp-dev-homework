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
	if (!user_type.equals("student")) {
		response.sendRedirect("/hs/error.jsp");
	}
}
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>编辑学生信息</title>
    
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
	<h2>当前身份：学生</h2>
	<hr />
	<s:form action="EditStudentInfoAction" mothod="Post">
		<table cellspacing="0px" width="450px" border="1px solid grey">
			<tr>
			<s:textfield label="学号" name="studentNo" value="%{#request.stu_info.studentNo}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="姓名" name="studentName" value="%{#request.stu_info.studentName}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="性别" name="studentGender" value="%{#request.stu_info.studentGender == '1'?'男':'女'}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="籍贯省" name="studentHometown" value="%{#request.stu_info.studentHometown}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="出生日期" name="studentBirthday" value="%{#request.stu_info.studentBirthday}" readonly="true"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="班级编号" name="studentNoInClass" value="%{#request.stu_info.studentNoInClass}"></s:textfield></td>
			</tr>
			<tr>
			<s:textfield label="邮箱" name="studentEmail" value="%{#request.stu_info.studentEmail}"></s:textfield></td>
			</tr>
			<tr>
			<td><s:textfield label="手机号码" name="studentMobile" value="%{#request.stu_info.studentMobile}"></s:textfield></td>
			</tr>
		</table>
		<s:submit value="提交"></s:submit>
    	<s:reset value="重置"></s:reset>
	</s:form>		
	<hr />
	
  </center>
  </body>
</html>
