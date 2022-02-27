<!-- 
In this example we will be demonstrating JSTL directive... 
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 

<%@page language="java" contentType="text/html"%>


<!-- 
1) There are two attributes i.e prefix and uri.... whatever character or string you put in prefix your JSTL tag will start with that character or string..
2) In uri you basically put which JSTL library you will be using.. in this example we are using core...
-->

<!--   
   Why to use JSTL?..
   1)In a JSP page we can write java code using various tags..But the problem is that for a front-end developer it becomes quite cumbersome to work with java code..
   2) Thus java has provided us the concept of JSTL wherein we can use JSTL tags instead of java code..
   3) This enables a front-end developer to work seamlessly without caring much about java code..
   4) Apart form this JSTL also increases the speed of development which eventually increases the productivity...
   5) JSTL tags are provided by taglib directory..   
 -->
 

  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"  >
<title>Insert title here</title>
</head>
<body>
   <h1>sfhsdfgasdgfa</h1>
 <!-- 
      1) We will see how to set values in variables using JSTL and how to define their operable scope..
      2) We will achieve this using set tag of JSTL..
 -->
 <c:set var="i" value="Mohammad" scope="application"></c:set><!-- this is how we set data and define its scope using set tag.. here var, value and scope are attributes-->
   
 <!-- 
         1) Now we will see how to print data using JSTL library...
         2) We will do this using out tag of JSTL..
 --> 
 <h2><c:out value="${i}"></c:out></h2>
<!-- 
      1) Now we will see how to remove values..
      2) We will do this using remove tag..
-->
<c:remove var="i"></c:remove><!-- This is how we remove the set variable..-->
 <h2><c:out value="${i}">Varaible has been removed...</c:out></h2>


</body>
</html>




