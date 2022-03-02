<!-- 
In this example we will be demonstrating JSTL directive... 
-->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


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
<meta charset="UTF-8">
<link rel="stylesheet" href="JSP.css" />
<title>Insert title here</title>
</head>
<body style="margin: 0; padding: 0;">
	<!-- Here in this example we will be demonstrating some more core JSTL tags-->



	<!-- 1) forEach loop tag... -->
	<div class="elements">
		<div class="inner">
			<c:forEach var="curr" items="${ strings }">
				<!-- This is how we use forEach loop for fetching items from Collection... -->
				<p>
					<c:out value="${ curr }"></c:out>
				</p>
				<br>
			</c:forEach>
		</div>
	</div>

	<c:forEach var="i" begin="1" end="10">
		<!-- This is how we loop within a range...This loop will start at 1 and go uptil 10... -->
		<h2>
			<c:out value="${i}"></c:out>
		</h2>
	</c:forEach>

	<!--2) if tag in JSP... -->
	<c:if test="${strings.size()==0}">
		<!-- This is how we use if tag in JSTL....-->
		<h1>There is no data in the ArrayList...</h1>
	</c:if>

	<!-- choose and when tag in JSP to implement switch case..-->

	<c:choose>
		<c:when test="${ strings.size()==0}"><!-- This is acts like our case 1..if this fails it will gon on the next one if there is any..else it will execute the code inside otherwise -->
			<h1>The ArrayList is empty...</h1>
		</c:when>
		<c:when test="${ strings.size()==1}">
			<h1>The ArrayList only contains 1 element...</h1><!-- This acts like our case 2..-->
		</c:when>
		<c:otherwise><!-- This acts like our default condition...-->
			<h1>ArrayList is appropriately filled...</h1>
		</c:otherwise>
	</c:choose>

<!--URL tag and Redirect Tag in JSP-->

<c:url  var="myurl" value="https://www.youtube.com" ><!-- This is how we set the url in a variable -->
<c:param name="q" value="ZnPRkgi8wXE&list=PL0zysOflRCel5BSXoslpfDawe8FyyOSZb&index=42"></c:param><!-- param tag is use to specify where to redirect from here.. -->
</c:url>

<c:redirect url="${myurl}"></c:redirect><!-- Here we redirect to the url set in the var of url tag i.e "myurl" in this case.. -->

</body>
</html>




