<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
div{
text-align: center;
list-style: none;
}

</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 
<div class="container">
  <h2 style="text-align: center;"> BEST LIST </h2><br>
  <div class="row">
  <p style="text-align: right;"><a href="">인기순</a> | <a href="">가격순</a> | <a href="">최신순</a> </p>
   <c:forEach items="${list}" var="s">
    <div class="col-md-4">
      <div class="thumbnail">
        <a href="sangdetail?gifttitle=${s.gifttitle}" target="_blank">
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