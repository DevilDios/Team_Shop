<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
div.giftmod{
text-align: center;
width: 400px;
margin-left:auto; 
margin-right:auto;
}
</style>
<title>상품</title>
</head>
<body>


	<h1 align="center">${dto.giftnum} 상품 수정</h1>
	
	<hr>
	<div class=giftmod align="center">
	<form action="gift_modify" method="post" enctype="multipart/form-data">
		<table class="table table-hover">
			<tr>
			<td>상품코드(수정불가)</td><td><input type="text" name = "giftnum" value = "${dto.giftnum}" readonly="readonly"></td>
			</tr>
			<tr>
			<td>상품명(필수)</td><td><input type="text" name = "gifttitle" value = "${dto.gifttitle}"></td>
			</tr>
			<tr>
			<td>상품 종류</td><td><input type="text" name = "giftpart" value = "${dto.giftpart}"></td>
			</tr>
			<tr>
			<td>썸네일 이미지</td><td><input type="text" name = "gifttumimg" value = "${dto.gifttumimg}"></td>
			</tr>
			<tr>
			<td>가격</td><td><input type="text" name = "giftprice" value = "${dto.giftprice}" pattern="[0-9]+"></td>
			</tr>
			<tr>
			<td>S사이즈재고</td><td><input type="text" name = "giftstocks" value = "${dto.giftstocks}" pattern="[0-9]+"></td>
			</tr>
			<tr>
			<td>M사이즈재고</td><td><input type="text" name = "giftstockm" value = "${dto.giftstockm}" pattern="[0-9]+"></td>
			</tr>
			<tr>
			<td>L사이즈재고</td><td><input type="text" name = "giftstockl" value = "${dto.giftstockl}" pattern="[0-9]+"></td>
			</tr>
			<tr>
			<td>XL사이즈재고</td><td><input type="text" name = "giftstockxl" value = "${dto.giftstockxl}" pattern="[0-9]+"></td>
			</tr>
			<tr>
			<td>설명 이미지 추가</td><td><input type="text" name = "giftimg" value = "${dto.giftimg}"></td>
			</tr>
			<tr>
			<td colspan="2" align="center"><input type="submit" value="등록하기"/></td>
			</tr>
		</table>
	</form>
	</div>
	<hr>
	<a href="index">메인화면</a>
	
	
</body>
</html>