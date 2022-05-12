<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
table,th,td{
text-align: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2 style="text-align: center;">상품 리스트</h2>
  <c:forEach items="${list}" var="sa">         
  <table class="table table-hover table-condensed" style="text-align: center;">
    <thead>
      <tr>
        <th>상품번호</th>      
        <th>상품제목</th>
        <th>가격</th>       
        <th>상품사진</th>       
        <th>수정/삭제</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>${sa.giftnum}</td>
        <td>
        <a href="sangdetail?giftnum=${sa.giftnum}">
        ${sa.gifttitle}
        </a>
        </td>     
        <td>${sa.price}</td>       
        <td><img src="${pageContext.request.contextPath}/dia/${sa.picture}" width="50" height="50"></td>    
        <td>
        <a href="sangmodify?dnum=${sa.giftnum}">
         <button> 수정 </button>
        </a>
        <a href="sangdelete?dnum=${sa.giftnum}">
         <button>   삭제</button>
        </a>
        
        </td>
      </tr>
      
    </tbody>
  </table>
  </c:forEach>
</div>
</body>
</html>