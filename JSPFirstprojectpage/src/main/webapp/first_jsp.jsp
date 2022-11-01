<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div>
		<%!
     int[] arr;
     public String hello(){
	   return "Good morning";
    }
   %>
		<%
      String str = hello();
      out.write(str);
   %>
	</div>
	<div>
		<h5>Sum of 2 numbers</h5>
		<%   
      int a = 10;
      int b = 20;
   %>
		<%= a + b%>
	</div>
	<div>
		<%
       arr = new int[5];
       arr[0] = 10; arr[1] = 20; arr[2] = 30; arr[3] = 40; arr[4] = 50;
    %>
		<table border="1">
			<%
       for(int i =0 ;i < arr.length ;i++){
       %>
			<tr>
			    <td><%=i %></td>
				<td><%=arr[i] %></td>
			</tr>
			<%	   
       }
      %>
		</table>

	</div>
</body>
</html>