package com.mycom.team;

public class Order_list_DTO {
	
	int giftnum;
	String orderstatus;
	int orders, orderm, orderl;
	String giftimg, gifttitle;
	int giftprice;
	public Order_list_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order_list_DTO(int giftnum, String orderstatus, int orders, int orderm, int orderl, String giftimg,
			String gifttitle, int giftprice) {
		super();
		this.giftnum = giftnum;
		this.orderstatus = orderstatus;
		this.orders = orders;
		this.orderm = orderm;
		this.orderl = orderl;
		this.giftimg = giftimg;
		this.gifttitle = gifttitle;
		this.giftprice = giftprice;
	}
	
	public int getGiftnum() {
		return giftnum;
	}
	public void setGiftnum(int giftnum) {
		this.giftnum = giftnum;
	}
	public String getOrderstatus() {
		return orderstatus;
	}
	public void setOrderstatus(String orderstatus) {
		this.orderstatus = orderstatus;
	}
	public int getOrders() {
		return orders;
	}
	public void setOrders(int orders) {
		this.orders = orders;
	}
	public int getOrderm() {
		return orderm;
	}
	public void setOrderm(int orderm) {
		this.orderm = orderm;
	}
	public int getOrderl() {
		return orderl;
	}
	public void setOrderl(int orderl) {
		this.orderl = orderl;
	}
	public String getGiftimg() {
		return giftimg;
	}
	public void setGiftimg(String giftimg) {
		this.giftimg = giftimg;
	}
	public String getGifttitle() {
		return gifttitle;
	}
	public void setGifttitle(String gifttitle) {
		this.gifttitle = gifttitle;
	}
	public int getGiftprice() {
		return giftprice;
	}
	public void setGiftprice(int giftprice) {
		this.giftprice = giftprice;
	}
	public int getTotalprice() {
		return (orders+orderm+orderl)*giftprice;
	}	
}
