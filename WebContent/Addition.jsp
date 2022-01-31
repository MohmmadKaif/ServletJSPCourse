<!-- 
Here we will be demonstrating the working of JSP file.
In JSP we dont have to create objects related to Servlets and we directly get it.
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<!--      
 There are four types of tags in jsp:
   1) Scriptlet
   2) Directive
   3) Decleration
   4) Expression.
-->

<!--
This tag is Scriptlet..
Whatever you write in this tag will be mapped as the content of Service(),doPost() or doGet() method..
-->
<%  
       int num1=10;
       int num2=20;
       out.println(num1+num2);
%>
<!--
This tag is known as Directive tag...
Whatever declerations we will be making it will go in this tag...
-->
<%@page import= "java.util.Scanner,java.util.ArrayList"%>

<!-- 
This tag is known as Declearation tag
This tag is helpful for declaring the objects and data types as class members.That is the variables which are declared outside service(),doGet() and doPost() methods.. 
-->

<%! 
      int num1;
      int num2;
      int sum=num1+num2;
     // We can also have methods here.... 
   
%>


<!--This is the expression tag..
   Whatever you want to display using the PrintWriter Object you can do it with this tag instead..
-->
The answer is <%= sum%>

</body>
</html>