package com.mycom.team;

import java.util.List;

public interface Gift_Service {
	
	// 상품 목록 조회
	List<Gift_DTO> getGiftList();
	
	// 상품 상세 조회
	Gift_DTO getContent(Gift_DTO vo);
	
	// 상품 등록
	void insertGift(Gift_DTO vo);

	// 상품 수정
	void updateGift(Gift_DTO vo);

	// 상품 삭제
	void deleteGift(Gift_DTO vo);
	
	void uploadGift(Gift_DTO vo);

}