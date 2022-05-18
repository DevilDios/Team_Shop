package com.mycom.team;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GiftServiceImpl implements Gift_Service{

	@Autowired
	private Gift_DAO Gift_DAO;
	
	@Override
	public List<Gift_DTO> getGiftList() {
		return Gift_DAO.getGiftList();
	}

	@Override
	public Gift_DTO getContent(Gift_DTO vo) {
		return Gift_DAO.getContent(vo);
	}

	@Override
	public void insertGift(Gift_DTO vo) {
		Gift_DAO.insertGift(vo);
	}

	@Override
	public void updateGift(Gift_DTO vo) {
		Gift_DAO.updateGift(vo);
	}

	@Override
	public void deleteGift(Gift_DTO vo) {
		Gift_DAO.deleteGift(vo);
	}
	
	@Override
	public void uploadGift(Gift_DTO vo) {
		Gift_DAO.uploadGift(vo);
	}

}