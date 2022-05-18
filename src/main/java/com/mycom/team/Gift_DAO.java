package com.mycom.team;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Gift_DAO{
	
	@Autowired
	private SqlSessionTemplate mybatis;

	public void insertGift(Gift_DTO vo) {
		System.out.println("===> Mybatis로 insertGift() 기능 처리");
		mybatis.insert("GiftMapper.insertGift", vo);
	}

	public void updateGift(Gift_DTO vo) {
		System.out.println("===> Mybatis로 updateGift() 기능 처리");
		mybatis.update("GiftMapper.updateGift", vo);
	}

	public void deleteGift(Gift_DTO vo) {
		System.out.println("===> Mybatis로 deleteGift() 기능 처리");
		mybatis.delete("GiftMapper.deleteGift", vo);
	}

	public Gift_DTO getContent(Gift_DTO vo) {
		System.out.println("===> Mybatis로 getContent() 기능 처리");
		return (Gift_DTO) mybatis.selectOne("GiftMapper.getContent", vo);
	}
	
	public Gift_DTO uploadGift(Gift_DTO vo) {
		System.out.println("===> Mybatis로 getContent() 기능 처리");
		return (Gift_DTO) mybatis.selectOne("GiftMapper.uploadGift", vo);
	}

	public List<Gift_DTO> getGiftList() {
		System.out.println("===> Mybatis로 getGiftList() 기능 처리");
		return mybatis.selectList("GiftMapper.getGiftList");
	}
	
	
}