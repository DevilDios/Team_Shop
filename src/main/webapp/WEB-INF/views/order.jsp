<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">결제 화면</h1>

<form action="paid" align="center">
<input type="hidden" name="id" value="${loginmember.id}">
<input type="hidden" name="giftnum" value="#"> <%--상품코드--%>
<input type="hidden" name="orderstatus" value="payment complete">
<input type="hidden" name="orders" value="#">
<input type="hidden" name="orderm" value="#">
<input type="hidden" name="orderl" value="#">
<input type="submit" value="결제하기">

</form>
</body>
</html>