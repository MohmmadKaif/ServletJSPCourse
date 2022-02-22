<!-- 
In this example we will be demonstrating taglib directive... 
-->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>

<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %><!--This is how we use taglib.-->

<!-- 
1) There are two attributes i.e prefix and uri.... whatever character or string you put in prefix your JSTL tag will start with that character or string..
2) In uri you basically put which JSTL library you will be using.. in this example we are using core...
-->

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Here we will be outputting a string using JSTL library -->
<c:out value="HELLO.. WELCOME TO JSTL TAG"></c:out>

<!-- For if we have to use Expression Language as seen below... -->
<c:if test="${ 3<7 }">
<h1> If Statement sucessfully executed... </h1>
</c:if>


</body>
</html>