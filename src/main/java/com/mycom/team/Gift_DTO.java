package com.mycom.team;

public class Gift_DTO {

	int giftnum;
	String gifttitle,giftpart,giftimg,giftprice,giftstocks,giftstockm,giftstockl,giftstockxl,gifttumimg;

	public Gift_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gift_DTO(int giftnum, String gifttitle, String giftpart, String giftimg, String giftprice, String giftstocks,
			String giftstockm, String giftstockl, String giftstockxl, String gifttumimg) {
		super();
		this.giftnum = giftnum;
		this.gifttitle = gifttitle;
		this.giftpart = giftpart;
		this.giftimg = giftimg;
		this.giftprice = giftprice;
		this.giftstocks = giftstocks;
		this.giftstockm = giftstockm;
		this.giftstockl = giftstockl;
		this.giftstockxl = giftstockxl;
		this.gifttumimg = gifttumimg;
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

	public String getGiftprice() {
		return giftprice;
	}

	public void setGiftprice(String giftprice) {
		this.giftprice = giftprice;
	}

	public String getGiftstocks() {
		return giftstocks;
	}

	public void setGiftstocks(String giftstocks) {
		this.giftstocks = giftstocks;
	}

	public String getGiftstockm() {
		return giftstockm;
	}

	public void setGiftstockm(String giftstockm) {
		this.giftstockm = giftstockm;
	}

	public String getGiftstockl() {
		return giftstockl;
	}

	public void setGiftstockl(String giftstockl) {
		this.giftstockl = giftstockl;
	}

	public String getGiftstockxl() {
		return giftstockxl;
	}

	public void setGiftstockxl(String giftstockxl) {
		this.giftstockxl = giftstockxl;
	}

	public String getGifttumimg() {
		return gifttumimg;
	}

	public void setGifttumimg(String gifttumimg) {
		this.gifttumimg = gifttumimg;
	}

	
	
	
}