<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<div class="container-sm">
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
   
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
	  <li data-target="#myCarousel" data-slide-to="3"></li>
	  <li data-target="#myCarousel" data-slide-to="4"></li>
	  <li data-target="#myCarousel" data-slide-to="5"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner">
    
      <div class="item active">
        <img src="${pageContext.request.contextPath}/image/main1.jpg" alt="Los Angeles" style="width:100%;">
      </div>

      <div class="item">
        <img src="${pageContext.request.contextPath}/image/main2.jpg" alt="Chicago" style="width:100%;">
      </div>
    
      <div class="item">
        <img src="${pageContext.request.contextPath}/image/main3.jpg" alt="New york" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="${pageContext.request.contextPath}/image/main4.jpg" alt="New york1" style="width:100%;">
      </div>

      <div class="item">
        <img src="${pageContext.request.contextPath}/image/main5.jpg" alt="New york2" style="width:100%;">
      </div>
      
      <div class="item">
        <img src="${pageContext.request.contextPath}/image/main6.jpg" alt="New york3" style="width:100%;">
      </div>                  
      
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>










































</body>
</html>