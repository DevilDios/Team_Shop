<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">${loginmember.id} 님의 주문목록</h1>


<%-- 
<table align="center" width="700">

<tr> <th>이미지</th> <th>상품명</th> <th>수량</th> <th>상품가격</th> <th>총가격<th> </tr>

<c:forEach items="${oldto}" var="g">
<tr> 
<td><img src="${pageContext.request.contextPath}/image/${g.giftimg}" height="50"></td> 
<td>${g.gifttitle}</td> 
<td>
<c:if test="${g.orders ne 0}" >S ${g.orders}개</c:if><c:if test="${g.orders ne 0 and g.orderm ne 0 and g.orderl ne 0}" >,&emsp;</c:if>
<c:if test="${g.orderm ne 0}" >M ${g.orderm}개</c:if><c:if test="${g.orderm ne 0 and g.orderl ne 0}" >,&emsp;</c:if>
<c:if test="${g.orderl ne 0}" >L ${g.orderl}개</c:if>
</td>
<td>
	${g.giftprice}
</td>
<td>
	${g.getTotalprice()}
</td>
</tr>

</c:forEach>


</table>



--%>









<div class="container">            
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>이미지</th> 
        <th>상품 및 옵션 정보</th> 
        <th>총 주문금액</th>
      </tr>
    </thead>
    <tbody>
<c:forEach items="${oldto}" var="g">
<tr> 
<td style="text-align : center; vertical-align : middle;" width="150"><img src="${pageContext.request.contextPath}/image/${g.giftimg}" height="100"></td> 
<td>
<br>
<div style=" float: left;"> 
<strong>&emsp;${g.gifttitle}</strong>
</div>
<div style=" float: right;">
<strong>${g.orderstatus}&emsp;</strong>
</div>
<br>
<hr>
<div style=" float: left;">
&emsp;
<c:if test="${g.orders ne 0}" >S ${g.orders}개</c:if><c:if test="${g.orders ne 0 and g.orderm ne 0 and g.orderl ne 0}" >,&emsp;</c:if>
<c:if test="${g.orderm ne 0}" >M ${g.orderm}개</c:if><c:if test="${g.orderm ne 0 and g.orderl ne 0}" >,&emsp;</c:if>
<c:if test="${g.orderl ne 0}" >L ${g.orderl}개</c:if>
</div>
<div style="float: right;">
<strong><fmt:formatNumber value="${g.giftprice}" type="number"/>원</strong>&emsp;&emsp;
</div>
</td> 
<td style="text-align : center; vertical-align : middle; width: 200px;">
<strong><fmt:formatNumber value="${g.getTotalprice()}" type="number"/>원</strong>
</td>
</tr>
</c:forEach>
    </tbody>
  </table>
</div>



















</body>
</html>