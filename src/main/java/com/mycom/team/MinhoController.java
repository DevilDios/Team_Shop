package com.mycom.team;


import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;


@Controller
public class MinhoController {

	@Autowired
	public SqlSession sqlSession;
	@Autowired
	private Gift_Service GiftService;
	
	
		@RequestMapping(value = "/gift_input")
		public String giftinput()
		{
			return "gift_input";
		}

		@RequestMapping(value = "/Gift_Insert")
		public String Gift_Insert(HttpServletRequest request,Model mo)
		{
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

			dao.GiftInsert(giftnum ,gifttitle, giftpart, gifttumimg, giftprice, giftstocks, giftstockm, giftstockl, giftstockxl, giftimg,0);
		
			return "gift_input";
		}
		
		//상품 목록 보기
		@RequestMapping("/gift_list")
		public String getGiftList(Model mo) {
			
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sanglist();		
			mo.addAttribute("list", list);		
			
			return "gift_list"; // View 이름 리턴
		}
		
		//수정폼으로 가기
		@RequestMapping(value = "/gift_modify_form")
		public String gift_modify_form(HttpServletRequest request, Model model)
		{
			int giftnum = Integer.parseInt(request.getParameter("giftnum"));
			Service dao = sqlSession.getMapper(Service.class);
			Gift_DTO dto = dao.getGiftModify(giftnum);
			model.addAttribute("dto", dto);
			return "gift_modify_form";
		}	
		
		//수정
		@RequestMapping(value = "/gift_modify")
		public String gift_modify(Gift_DTO dto)
		{
			Service dao = sqlSession.getMapper(Service.class);
			dao.setGiftModify(dto.getGiftnum(), dto.getGifttitle(), dto.getGiftpart(), dto.getGiftimg(), dto.getGiftprice(), dto.getGiftstocks(), 
					dto.getGiftstockm(), dto.getGiftstockl(), dto.getGiftstockxl(),dto.getGifttumimg(),0);
			return "redirect:managerindex";
		}
		
		
		@RequestMapping(value = "/gift_delete")
		public String gift_delete(HttpServletRequest request)
		{
			int giftnum = Integer.parseInt(request.getParameter("giftnum"));
			Service dao = sqlSession.getMapper(Service.class);
			dao.GiftDelete(giftnum);
			return "redirect:managerindex";	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*	
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
				uploadFile.transferTo(new File("src/main/webapp/image" + fileName));
			}
			vo.setFileName(fileName);
			GiftService.uploadGift(vo);

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
		
		@RequestMapping(value = "insertGift", method = RequestMethod.POST)
		public String fileSubmit(Gift_DTO dto) {
			MultipartFile uploadfile = dto.getUploadFile();
			if (uploadfile != null) {
				String fileName = uploadfile.getOriginalFilename();
				dto.setFileName(fileName);
				try {
					// 1. FileOutputStream 사용
					byte[] fileData = file.getBytes();
					FileOutputStream output = new FileOutputStream("C:/images/" + fileName);
					output.write(fileData);
					
					// 2. File 사용
					File file = new File("C:/images/" + fileName);
					uploadfile.transferTo(file);
				} catch (IOException e) {
					e.printStackTrace();
				} // try - catch
			} // if
			// 데이터 베이스 처리를 현재 위치에서 처리
			return "redirect:getBoardList.do"; // 리스트 요청으로 보내야하는데 일단 제외하고 구현
		}
		*/
	}
	
	
	
	

