<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div {
text-align: right;
}
ul{
text-align: left;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
   <nav>
   
     <div>

 
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
   
   
<hr>
    <nav>
     <ul class="log_box">
        <a href="index"> 홈으로 </a>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp; 
            <a href="bestlist"> Best </a> &emsp; 
             <a href="#"> Outer </a> &emsp;      
                 <a href="#"> Top </a>&emsp;
                   <a href="#"> Bottom </a>&emsp;
     </ul>
   </nav>
<hr>
<br>
</header>
</body>
</html>