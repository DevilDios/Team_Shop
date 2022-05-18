<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.navbar-default {
    background-color: #FFFFFF;
    border-color: #FFFFFF;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<header>
<nav class="navbar navbar-inverse ">
  <div class="container-fluid">

    <ul class="nav navbar-nav navbar-right">





		<c:choose>
			<c:when test="${islogon == true && loginmember != null && loginmember.id eq 'master'}">
				<li class="active"><a href="user_modify_form">< ${loginmember.name} 님 ></a> </li>
			      <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>  로그아웃</a></li>	
			      <li><a href="managerindex"><span class="glyphicon glyphicon-cog"></span>  관리자</a></li>
			</c:when>
			<c:when test="${islogon == true && loginmember != null}">
							<li class="active"><a href="user_modify_form">< ${loginmember.name} 님 ></a></li>
			      <li><a href="logout"><span class="glyphicon glyphicon-log-out"></span>  로그아웃</a></li>
				  <li><a href="order_list"><span class="glyphicon glyphicon-road"></span>  주문조회</a></li>
			      <li><a href="#"><span class="glyphicon glyphicon-shopping-cart"></span>  장바구니</a></li>
			</c:when>
			<c:otherwise>
			      <li><a href="loginform"><span class="glyphicon glyphicon-log-in"></span>  로그인</a></li>
				  <li><a href="memberinput"><span class="glyphicon glyphicon-user"></span>  회원가입</a></li>
				  <li><a href="loginform"><span class="glyphicon glyphicon-road"></span>  주문조회</a></li>
			      <li><a href="loginform"><span class="glyphicon glyphicon-shopping-cart"></span>  장바구니</a></li>
			</c:otherwise>
		</c:choose> 

    </ul>
  </div>
 
</nav>
<nav class="navbar navbar-default">
<div class="container-fluid">
  <ul class="nav navbar-nav">
  	<li><a href="index"><img src="${pageContext.request.contextPath}/image/logo.jpg" ></a></li>
            	<li><a href="bestlist"> Best </a></li>
            	<li><a href="outlist"> Outer </a></li>
               	<li><a href="toplist"> Top </a></li>
                <li><a href="#"> Dress </a></li>
				<li><a href="#"> Shoes </a></li>
                <li><a href="#"> ACC </a></li>
  </ul> 
 </div>
</nav>


<%-- glyphicon glyphicon-log-out--%>
<%--
   <nav>
   
	     <div>
	
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    	 
		<c:choose>
			<c:when test="${islogon == true && loginmember != null && loginmember.id eq 'master'}">
				<a href="user_modify_form">< ${loginmember.name} 님 ></a> &emsp; 
				<a href="logout">로그아웃</a>	&emsp;	
				<a href="managerindex"> 관리자 </a>&emsp;  
			</c:when>
			<c:when test="${islogon == true && loginmember != null}">
				<a href="user_modify_form">< ${loginmember.name} 님 ></a> &emsp; 
				<a href="logout">로그아웃</a>	&emsp;
				<a href="order_list"> 주문조회 </a>&emsp;
				<a href="#"> 장바구니 </a>&emsp;
			</c:when>
			<c:otherwise>
		        <a href="loginform"> 로그인 </a>&emsp;    
		        <a href="memberinput"> 회원가입 </a>&emsp;
		        <a href="loginform"> 주문조회 </a>&emsp;
				<a href="loginform"> 장바구니 </a>&emsp;
			</c:otherwise>
		</c:choose>        
	
	     </div>

   </nav>
  
   

<br>
    <nav>
     <ul class="log_box">
        <a href="index"> 홈으로 </a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; 
            <a href="bestlist"> Best </a> &emsp; 
             <a href="outlist"> Outer </a> &emsp;      
                 <a href="toplist"> Top </a>&emsp;
                   <a href="bottomlist"> Bottom </a>&emsp;
     </ul>
   </nav>
<br>   
   
--%>   
   
   

  
   
   
   
   

</header>
</html>