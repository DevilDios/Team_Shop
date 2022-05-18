package com.mycom.team;

public class OrderDTO {

	String id;
	int giftnum;
	String orderstatus;
	int orders;
	int orderm;
	int orderl;
	public OrderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderDTO(String id, int giftnum, String orderstatus, int orders, int orderm, int orderl) {
		super();
		this.id = id;
		this.giftnum = giftnum;
		this.orderstatus = orderstatus;
		this.orders = orders;
		this.orderm = orderm;
		this.orderl = orderl;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	
}
