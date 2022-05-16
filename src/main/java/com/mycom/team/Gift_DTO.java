package com.mycom.team;

public class Gift_DTO {
	
	int giftnum;
	String gifttitle, giftpart, giftimg,gifttumimg;
	int giftprice, giftstocks, giftstockm, giftstockl, giftstockxl;
	public Gift_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gift_DTO(int giftnum, String gifttitle, String giftpart, String giftimg, String gifttumimg, int giftprice,
			int giftstocks, int giftstockm, int giftstockl, int giftstockxl) {
		super();
		this.giftnum = giftnum;
		this.gifttitle = gifttitle;
		this.giftpart = giftpart;
		this.giftimg = giftimg;
		this.gifttumimg = gifttumimg;
		this.giftprice = giftprice;
		this.giftstocks = giftstocks;
		this.giftstockm = giftstockm;
		this.giftstockl = giftstockl;
		this.giftstockxl = giftstockxl;
	}
	public int getGiftnum() {
		return giftnum;
	}
	public void setGiftnum(int giftnum) {
		this.giftnum = giftnum;
	}
	public String getGifttitle() {
		return gifttitle;
	}
	public void setGifttitle(String gifttitle) {
		this.gifttitle = gifttitle;
	}
	public String getGiftpart() {
		return giftpart;
	}
	public void setGiftpart(String giftpart) {
		this.giftpart = giftpart;
	}
	public String getGiftimg() {
		return giftimg;
	}
	public void setGiftimg(String giftimg) {
		this.giftimg = giftimg;
	}
	public String getGifttumimg() {
		return gifttumimg;
	}
	public void setGifttumimg(String gifttumimg) {
		this.gifttumimg = gifttumimg;
	}
	public int getGiftprice() {
		return giftprice;
	}
	public void setGiftprice(int giftprice) {
		this.giftprice = giftprice;
	}
	public int getGiftstocks() {
		return giftstocks;
	}
	public void setGiftstocks(int giftstocks) {
		this.giftstocks = giftstocks;
	}
	public int getGiftstockm() {
		return giftstockm;
	}
	public void setGiftstockm(int giftstockm) {
		this.giftstockm = giftstockm;
	}
	public int getGiftstockl() {
		return giftstockl;
	}
	public void setGiftstockl(int giftstockl) {
		this.giftstockl = giftstockl;
	}
	public int getGiftstockxl() {
		return giftstockxl;
	}
	public void setGiftstockxl(int giftstockxl) {
		this.giftstockxl = giftstockxl;
	}
}