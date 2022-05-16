<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">${loginmember.id} 님의 주문목록</h1>
<table align="center" width="700">

<tr> <th>상품이미지</th> <th>상품제목</th> <th>수량</th> <th>상품가격</th> <th>총가격<th> </tr>

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
<tr>

</c:forEach>

</table>
</body>
</html>