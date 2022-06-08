<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
div.ordero{
width: 800px;
margin-left:auto; 
margin-right:auto;
}
th,td{
text-align: center;}
</style>
<title>Insert title here</title>
</head>
<body>
<h1 style="text-align: center;">결제 화면</h1>
<div class="ordero">
<c:forEach items="${list}" var="o">
<form action="paid" align="center" method="post" >


<table class="table table-hover" align="center" width="900">

<tr> 
<th>이미지</th> 
<th>타이틀</th> 
<th>사이즈</th> 
<th>수량</th> 
<th>총가격</th> 
<tr>

<tr> 
<td>
<img src="${pageContext.request.contextPath}/image/${giftimg}" width="150" height="150"> </td>
 <td> ${o.gifttitle}</td>
  <td>${giftsize}</td> 
  <td>${amount}</td> 
  <td>${tot} 원</td>
  <tr>

</table>

<input type="submit" value="결제하기">



</form>
</c:forEach>
</div>
</body>
</html>