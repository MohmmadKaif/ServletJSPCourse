<!--This is our error page.This page will be called when we an excetion is encountered..-->


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %><!-- Here we are using isErrorPage attribute to signify this page as Error page and this will also enable us the access of using Expetion object impicitly -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color=red">
    <h1> ERROR 500 </h1>
   <h1> <%  
    //Excpetion Object can only be used in an error page...
    out.println(exception.getMessage());
    %>
    </h1>
      
</body>
</html>