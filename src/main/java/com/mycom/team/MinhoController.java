package com.mycom.team;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class MinhoController {

	@Autowired
	public SqlSession sqlSession;
	
	@RequestMapping(value = "/gift_input")
	public String giftinput()
	{
		return "gift_input";
	}

		@Autowired
		private Gift_Service GiftService;
		
		//상품 목록 검색
		@RequestMapping("/getGiftList")
		public String getGiftList(Gift_DTO vo, Model model) {
			 List<Gift_DTO> GiftList = GiftService.getGiftList();
			 
			// Model 정보 저장
			model.addAttribute("GiftList",GiftList);
			return "gift_list"; // View 이름 리턴
		}

		//상품 상세 조회
		@RequestMapping("/getContent")
		public String getGift(Gift_DTO vo, Model model) {
			model.addAttribute("board", GiftService.getContent(vo)); // Model 정보 저장
			return "content"; // View 이름 리턴
		}
		
		// 상품 등록
		@RequestMapping(value="/insertGift") 
		public String insGift(Gift_DTO vo,HttpServletRequest request,Model mo) throws IOException { 
			String fileName=null;
			MultipartFile uploadFile = vo.getUploadFile();
			if (!uploadFile.isEmpty()) {
				String originalFileName = uploadFile.getOriginalFilename();
				String ext = FilenameUtils.getExtension(originalFileName);	//확장자 구하기
				UUID uuid = UUID.randomUUID();	//UUID 구하기
				fileName=uuid+"."+ext;
				uploadFile.transferTo(new File("D:\\upload\\" + fileName));
			}
			vo.setFileName(fileName);
			GiftService.insertGift(vo);

			Service dao = sqlSession.getMapper(Service.class);
			int giftnum = Integer.parseInt(request.getParameter("giftnum"));
			String gifttitle = request.getParameter("gifttitle");
			String giftpart = request.getParameter("giftpart");
			String gifttumimg = request.getParameter("gifttumimg");
			int giftprice = Integer.parseInt(request.getParameter("giftprice"));
			int giftstocks = Integer.parseInt(request.getParameter("giftstocks"));
			int giftstockm = Integer.parseInt(request.getParameter("giftstockm"));
			int giftstockl = Integer.parseInt(request.getParameter("giftstockl"));
			int giftstockxl = Integer.parseInt(request.getParameter("giftstockxl"));
			String giftimg = request.getParameter("giftimg");

			dao.giftinsert(giftnum ,gifttitle, giftpart, gifttumimg, giftprice, giftstocks, giftstockm, giftstockl, giftstockxl, giftimg);
			
			return "redirect:index"; 
		}
		
		
		
		// 상품 페이지 이동
		@RequestMapping("/moveInsertGift") 
		public String moveInsertGift()throws Exception{
			return "insertGift";
		}
		 

		// 상품  수정
		@RequestMapping("/updateGift")
		public String updateGift(@ModelAttribute("board") Gift_DTO vo) {
			GiftService.updateGift(vo);
			return "redirect:getGiftList";
		}

		// 상품 삭제
		@RequestMapping("/deleteGift")
		public String deleteGift(Gift_DTO vo) {
			GiftService.deleteGift(vo);
			return "redirect:getGiftList";
		}
	}
	
	
	

