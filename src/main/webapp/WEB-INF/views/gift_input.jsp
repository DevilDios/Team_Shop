<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>
<body>

<h1 align="center">상품등록폼</h1>
<form action='giftsave' method="post">
<table border="1" width="500px" align="center">
<th colspan="2" align="center">상품등록</th>
<tr>
<td>상품코드(수정불가)</td><td><input type="text" name = "giftnum"></td>
</tr>
<tr>
<td>상품명(필수)</td><td><input type="text" name = "gifttitle"></td>
</tr>
<tr>
<td>종류(반팔,맨투맨 이런것)</td><td><input type="text" name = "giftpart"></td>
</tr>
<tr>
<td>썸네일 이미지</td><td><input type="text" name = "gifttumimg"></td>
</tr>
<tr>
<td>가격</td><td><input type="text" name = "giftprice"></td>
</tr>
<tr>
<td>S사이즈재고</td><td><input type="text" name = "giftstocks"></td>
</tr>
<tr>
<td>M사이즈재고</td><td><input type="text" name = "giftstockm"></td>
</tr>
<tr>
<td>L사이즈재고</td><td><input type="text" name = "giftstockl"></td>
</tr>
<tr>
<td>XL사이즈재고</td><td><input type="text" name = "giftstockxl"></td>
</tr>
<tr>
<td>설명 이미지 추가</td><td><input type="text" name = "giftimg"></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" values = "등록하기"><input input type="reset" values = "리셋">
</td>
</tr>
</table>

</form>
</body>
</html>