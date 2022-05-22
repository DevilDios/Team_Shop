<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko" lang="ko"
	xmlns:og="http://ogp.me/ns#"
	xmlns:fb="http://www.facebook.com/2008/fbml">
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
tr, td {
	text-align: center;
}

table {
	size: 70%;
}

li {
	list-style: none;
}

.centered {
	left: 50%;
	margin-left: 420px;
}

select {
	text-align-last: center;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>

<%-- #######################################################################################################################  --%>
<link
	href="//lissoms.co.kr/skin/site/basic2/css/setting.css?ver=202205200"
	rel="stylesheet" type="text/css" />
<link
	href="//lissoms.co.kr/skin/site/basic2/css/hyssence_sub.css?ver=202205200"
	rel="stylesheet" type="text/css" />
<%-- #######################################################################################################################  --%>

</head>
<h1 style="text-align: center;">상품상세</h1>
<body onload="init();">

	<c:forEach items="${dlist}" var="d">
		<!-- 수량추가 총금액   -->
		<script language="JavaScript">
			var sell_price;

			function init() {
				sell_price = document.form.sell_price.value;
				document.form.sum.value = sell_price;
				change();
			}

			function add() {
				var hm;
				hm = document.form.amount;
				sum = document.form.sum;
				hm.value++;
				sum.value = parseInt(hm.value) * parseInt(sell_price);
			}

			function del() {
				var hm;
				hm = document.form.amount;
				sum = document.form.sum;
				if (hm.value > 1) {
					hm.value--;
					sum.value = parseInt(hm.value) * parseInt(sell_price);
				}
			}

			function change() {
				var hm;
				hm = document.form.amount;
				sum = document.form.sum;

				if (hm.value < 0) {
					hm.value = 0;
				}
				parseInt(sum.value) = parseInt(hm.value) * parseInt(sell_price);
			}

			function changeitem() {

				var size = $("select[name = giftsize]").val();

				alert(size + "사이즈 추가합니다");

				$("#appenditem")
						.append(
								"<li>"
										+ size
										+ ' size 수량 :'
										+ ' <input type="text" name="amount" value="1" size="3" onchange="change();" style="border:none">'
										+ ' <input type="button" value=" + " onclick="add();">&emsp;<input type="button" value=" - " onclick="del();"><br>'
										+ "</li>");

			}
		<%-- #######################################################################################################################  --%>
			function option_select_tmp(idx, pro_depth, pouid, poname, pcode) {
				changeitem();
				$('#option_select' + idx + '_id').val(pouid);
				$('#option_select' + idx + '_poname').html(poname);
				$('#option_select_' + idx + '_box').css({
					'display' : 'none'
				});
				setTimeout(function() {
					$('#option_select_' + idx + '_box').attr({
						'style' : ''
					});
				}, 100);

				if (idx + 'depth' == pro_depth) {
					option_select_add(pcode);
					changeitem();
				} else {
					option_select(idx, pcode);
					changeitem();
				}

			}
		<%-- #######################################################################################################################  --%>
			
		</script>
		<div id="section3" class="container-fluid">
			<div class="container container-table">
				<div class="col-xl-6" style="text-align: center;">
					<form name="form" method="post">
						<table class="table table-hover text-center" width="50%"
							align="center" style="text-align: center;">

							<tr>
								<td rowspan="9" style="text-align: center;"><img
									src="${pageContext.request.contextPath}/image/${d.giftimg}"
									width="300" height="300"></td>
							</tr>
							<tr>
								<th>상품제목</th>
								<td>${d.gifttitle}</td>
							</tr>
							<tr>
								<th>배송정보</th>
								<td>대한통운</td>
							</tr>
							<tr>
								<th>배송비</th>
								<td>2500원</td>
							</tr>
							<tr>
								<th>판매가</th>
								<td>${d.giftprice}원</td>
							</tr>

							<tr>
								<th>필수옵션</th>
								<td style="text-align-last: center;">
									<ul style="text-align-last: center;">
										<select class="form-control" name="giftsize"
											onchange="changeitem()"
											style="width: 150px; text-align-list: center;">
									</ul>
									<option value="">사이즈선택</option>
									<option value="S">S / ${d.giftprice} 원</option>
									<option value="M">M / ${d.giftprice} 원</option>
									<option value="L">L / ${d.giftprice} 원</option>
									<option value="XL">XL / ${d.giftprice} 원</option> </select>
								</td>
							</tr>
							<tr>
								<th>주문현황</th>
								<td>
									<li id="appenditem"></li>

								</td>
							</tr>
							<tr>
								<th>총 합계금액</th>
								<td><input type="hidden" name="sell_price"
									value="${d.giftprice}"> 총금액 : <input type="text"
									name="sum" size="4" readonly style="border: none">원<br>
									<br>
									<p style="text-align: center;">
										<input type="button" value="장바구니"
											onclick="location.href='cart_userset'"
											class="btn btn-warning"> <input type="submit"
											value="바로구매"
											onclick="location.href='order?gifttitle=${d.gifttitle}'"
											class="btn btn-danger">
									</p></td>
							</tr>
						</table>


						<%-- #######################################################################################################################  --%>


						<div class="view_option">
							<dl>
								<dt>필수 옵션</dt>
								<dd>
									<div class="view_select">
										<div class="this">
											<em id="option_select1_poname">옵션을 선택해주세요. (필수)</em><span
												class="shape"></span>
										</div>
										<div class="open_box" id="option_select_1_box">
											<a href="#none"
												onclick="option_select_tmp('1','1depth','9102','베이지','R1835-R7174-L0812'); return false;"
												class="option"> 베이지 / 63,500원 </a> <a href="#none"
												onclick="option_select_tmp('1','1depth','9103','블랙','R1835-R7174-L0812'); return false;"
												class="option"> 블랙 / 63,500원 </a>
										</div>
										<input type="hidden" name="_option_select1"
											ID="option_select1_id" value="">
									</div>
								</dd>
							</dl>

						</div>

						<!-- 선택한 옵션 -->
						<div class="view_option result" id="span_seleced_list">
							<dl>
								<dt class="if_before">구매하실 상품 옵션을 선택해 주시기 바랍니다.</dt>
							</dl>
						</div>
						<div class="this">
							<em id="option_select1_poname">베이지</em> <span class="shape"></span>
						</div>
						<!-- 결제금액계산 -->
						<div class="view_total">
							<span class="total_tt">총 합계금액</span>
							<div class="after_price">
								<strong id="option_select_expricesum_display">0</strong>원
							</div>
						</div>
						<div class="view_option result" id="span_seleced_list">
							<dl>
								<dt>베이지</dt>
								<dd class="counter">
									<div class="counter_box">
										<input type="text" name="" id="input_cnt_75101"
											class="updown_input" value="1" readonly=""> <span
											class="updown"> <a href="#none"
											onclick="option_select_update('up' , '75101','R1835-R7174-L0812');"
											class="btn_up" title="더하기"></a> <a href="#none"
											onclick="option_select_update('down' , '75101','R1835-R7174-L0812')"
											class="btn_down" title="빼기"></a>
										</span>
									</div>
								</dd>
								<dd class="price">
									<span class="price"><strong>63,500</strong>원</span>
								</dd>
								<dd class="delete">
									<a href="#none"
										onclick="option_select_del('75101','R1835-R7174-L0812')"
										class="btn_delete" title="옵션삭제"></a>
								</dd>
							</dl>

							<input type="hidden" name="option_select_expricesum"
								id="option_select_expricesum" value="63500"> <input
								type="hidden" name="option_select_cnt" id="option_select_cnt"
								value="1">
						</div>
						<%-- #######################################################################################################################  --%>


					</form>
					<br>
					<div style="text-align: center;">
						<input type="button" value="상품목록"
							onclick="location.href='bestlist'" class="btn btn-info">
						<input type="button" value="홈으로" onclick="location.href='index'"
							class="btn btn-primary">
					</div>
				</div>
				<br>
				<div class="container">
					<table class="table table-hover" style="text-align: center;">
						<td><a href="#section1">상품상세보기</a></td>
						<td><a href="#section2">배송/교환/환불안내</a></td>
						<td><a href="#section4">상품문의</a></td>
					</table>
				</div>
			</div>
		</div>
		<div id="section1" class="container-fluid">
			<p align="center">
				<img src="${pageContext.request.contextPath}/image/${d.gifttumimg}">
			</p>
		</div>
		<div id="section2" class="container-fluid"></div>
		<div class="container col-xl-6">
			<table class="table table-hover te">
				<td><a href="#section1">상품상세보기</a></td>
				<td><a href="#section2">배송/교환/환불안내</a></td>
				<td><a href="#section3">맨위로</a></td>
			</table>
		</div>
		</div>
		</div>
		<div id="section4" class="container-fluid"></div>
	</c:forEach>

</body>

</html>
