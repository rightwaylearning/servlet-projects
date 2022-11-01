<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="stident.info.com.Student"%>
<%@page import="java.util.List"%>
<%@page import="stident.info.com.StudentFactrory"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<table border='1'>
		<%
		List<Student> list = StudentFactrory.getStudentList();
		for (Student s : list) {
		%>
		<tr>
			<th><%=s.getRollNumber() %></th>
			<th><%=s.getName() %></th>
			<th><%=s.getStd() %></th>
		</tr>
		<%
		}
		%>
	</table>
</body>
</html>