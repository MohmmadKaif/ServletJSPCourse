<!-- 
In this example we will be demonstrating the Exception Handelling using error pages in JSP.. 
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  errorPage="error.jsp"%><!-- Here we are using errorPage Attribute in order to call error.jsp whenever we encounter an excpetion.. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--   
1) This is the demonstration of Exception Handeling in JSP...
2) Though we can use try and catch blocks using JSP but to have a web page in response we use something called as error pages in JSP...
3) Below is the demonstration for it...  
-->
  <%
      int a=9/0;  // This line will throw an exception...To handle this Exception we will create a new JSP page by a name of eror.jsp  
      out.println(a);
  %>
</body>
</html>