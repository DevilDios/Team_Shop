package com.mycom.team;

import org.springframework.web.multipart.MultipartFile;

public class Gift_DTO extends Criteria{


	int giftnum,giftstocks,giftstockm,giftstockl,giftstockxl,giftprice,readcnt;
	String gifttitle,giftpart,giftimg,gifttumimg;
	String fileName;
	MultipartFile uploadFile;
	
	public Gift_DTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MultipartFile getUploadFile() {
		return uploadFile;
	}

	public void setUploadFile(MultipartFile uploadFile) {
		this.uploadFile = uploadFile;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Gift_DTO(int giftnum, int giftstocks, int giftstockm, int giftstockl, int giftstockxl, int giftprice,
			int readcnt, String gifttitle, String giftpart, String giftimg, String gifttumimg) {
		super();
		this.giftnum = giftnum;
		this.giftstocks = giftstocks;
		this.giftstockm = giftstockm;
		this.giftstockl = giftstockl;
		this.giftstockxl = giftstockxl;
		this.giftprice = giftprice;
		this.readcnt = readcnt;
		this.gifttitle = gifttitle;
		this.giftpart = giftpart;
		this.giftimg = giftimg;
		this.gifttumimg = gifttumimg;

	}

	public int getGiftnum() {
		return giftnum;
	}
	public void setGiftnum(int giftnum) {
		this.giftnum = giftnum;
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

	public int getGiftprice() {
		return giftprice;
	}

	public void setGiftprice(int giftprice) {
		this.giftprice = giftprice;
	}

	public int getReadcnt() {
		return readcnt;
	}

	public void setReadcnt(int readcnt) {
		this.readcnt = readcnt;
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

}