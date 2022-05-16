<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
p{
text-align: center;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<div class="container">
  <h2 style="text-align: center;"> LIST </h2><br>
  <div class="row">
  <p style="text-align: right;"><a href="out_readcnt">인기(조회)순</a> | <a href="out_price">높은가격순</a> | <a href="out_dprice">낮은가격순</a> </p>
   <c:forEach items="${list}" var="s">
    <div class="col-md-3">
      <div class="thumbnail">
        <a href="sangdetail?giftnum=${s.giftnum}" target="_self">
          <img src="${pageContext.request.contextPath}/image/${s.giftimg}" style="width:200px; height:200px;">
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