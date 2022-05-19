<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
p {
text-align: center;
}
li {
text-align: right;
}
div{
border-right:none;

border-left:none;

border-top:none;

border-bottom:none;

}
a
{
padding: 0;
border: none;
background: none;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 

<div class="container" >
  
  <div class="row col-xl-6" >
  
  <nav class="navbar navbar-default" style="text-align: right" >
    <div class="container-fluid navbar-right" style="text-align: right">
  <ul class="nav navbar-nav" style="text-align: right">
  
   <li> <a href="sang_readcnt?part=${part}" class="btn" >인기(조회)순</a></li>
    <li><a href="sanglist_price?part=${part}" class="btn">높은가격순 </a> </li>
   <li> <a href="sanglist_dprice?part=${part}" class="btn">낮은가격순</a></li>
    
    
   
   </ul>
   </div>
   </nav>
   <c:forEach items="${list}" var="s">
    <div class="col-md-3" >
      <div class="thumbnail" style="border:none">
        <a href="sangdetail?giftnum=${s.giftnum}" target="_self" >
          <img  src="${pageContext.request.contextPath}/image/${s.giftimg}" class="img-responsive" style="width:200px; height: 200px;">
          <div class="caption">
            <p>${s.gifttitle}</p>
            <p>￦ ${s.giftprice}원</p>
          </div>
        </a>
      </div>
    </div>

    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   </c:forEach>
  </div>
</div>

 
</body>
</html>