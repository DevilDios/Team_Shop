package com.mycom.team;

import java.util.List;

public interface Gift_Service {
	
	// 글 목록 조회
	List<Gift_DTO> getGiftList();
	
	// 글 상세 조회
	Gift_DTO getContent(Gift_DTO vo);
	
	// 글 등록
	void insertGift(Gift_DTO vo);

	// 글 수정
	void updateGift(Gift_DTO vo);

	// 글 삭제
	void deleteGift(Gift_DTO vo);
	
}