package com.mycom.team;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import oracle.net.aso.r;

import org.apache.commons.io.FileUtils;
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
		public String Gift_Insert(MultipartHttpServletRequest request,Model mo) throws IOException
		{
			
			
			//경로설정 개인별로 이클립스 이미지
			String PATH = "C:\\prjt\\Team_Shop\\src\\main\\webapp\\image";
			Service dao = sqlSession.getMapper(Service.class);
			int giftnum = Integer.parseInt(request.getParameter("giftnum"));
			String gifttitle = request.getParameter("gifttitle");
			String giftpart = request.getParameter("giftpart");
			MultipartFile tumimg = request.getFile("gifttumimg");
			String gifttumimg = tumimg.getOriginalFilename();
			int giftprice = Integer.parseInt(request.getParameter("giftprice"));
			int giftstocks = Integer.parseInt(request.getParameter("giftstocks"));
			int giftstockm = Integer.parseInt(request.getParameter("giftstockm"));
			int giftstockl = Integer.parseInt(request.getParameter("giftstockl"));
			int giftstockxl = Integer.parseInt(request.getParameter("giftstockxl"));
			MultipartFile img = request.getFile("giftimg");
			String giftimg = img.getOriginalFilename();
			
			
			img.transferTo(new File(PATH, giftimg));
			tumimg.transferTo(new File(PATH, gifttumimg));
			
       
			dao.GiftInsert(giftnum ,gifttitle, giftpart, gifttumimg, giftprice, giftstocks, giftstockm, giftstockl, giftstockxl, giftimg,0);
		
			return "gift_input";
		}

		
		//�긽�뭹 紐⑸줉 蹂닿린
		@RequestMapping("/gift_list")
		public String getGiftList(Gift_DTO dto,Model mo,HttpServletRequest request) {
	       
			Paging paging = new Paging();
	        paging.setCri(dto);
	        paging.setTotalCount(151); // 由ъ뒪�듃 珥앷갗�닔 (�뵒鍮꾩뿉�꽌 count(*) 媛�吏�怨� ���빞 �븿)
	        request.setAttribute("paging", paging);
			Service dao = sqlSession.getMapper(Service.class);
			ArrayList<Gift_DTO> list = dao.sanglist();		
			mo.addAttribute("list", list);		
			
			return "gift_list"; // View �씠由� 由ы꽩
		}
		
		//�닔�젙�뤌�쑝濡� 媛�湲�
		@RequestMapping(value = "/gift_modify_form")
		public String gift_modify_form(HttpServletRequest request, Model model)
		{
			int giftnum = Integer.parseInt(request.getParameter("giftnum"));
			Service dao = sqlSession.getMapper(Service.class);
			Gift_DTO dto = dao.getGiftModify(giftnum);
			model.addAttribute("dto", dto);
			return "gift_modify_form";
		}	
		
		//�닔�젙
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
		//�긽�뭹 �긽�꽭 議고쉶
		@RequestMapping("/getContent")
		public String getGift(Gift_DTO vo, Model model) {
			model.addAttribute("board", GiftService.getContent(vo)); // Model �젙蹂� ���옣
			return "content"; // View �씠由� 由ы꽩
		}

		// �긽�뭹 �벑濡�
		@RequestMapping(value="/insertGift") 
		public String insGift(Gift_DTO vo,HttpServletRequest request,Model mo) throws IOException { 
			String fileName=null;
			MultipartFile uploadFile = vo.getUploadFile();
			if (!uploadFile.isEmpty()) {
				String originalFileName = uploadFile.getOriginalFilename();
				String ext = FilenameUtils.getExtension(originalFileName);	//�솗�옣�옄 援ы븯湲�
				UUID uuid = UUID.randomUUID();	//UUID 援ы븯湲�
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
		
		
		
		// �긽�뭹 �럹�씠吏� �씠�룞
		@RequestMapping("/moveInsertGift") 
		public String moveInsertGift()throws Exception{
			return "insertGift";
		}
		 

		// �긽�뭹  �닔�젙
		@RequestMapping("/updateGift")
		public String updateGift(@ModelAttribute("board") Gift_DTO vo) {
			GiftService.updateGift(vo);
			return "redirect:getGiftList";
		}

		// �긽�뭹 �궘�젣
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
					// 1. FileOutputStream �궗�슜
					byte[] fileData = file.getBytes();
					FileOutputStream output = new FileOutputStream("C:/images/" + fileName);
					output.write(fileData);
					
					// 2. File �궗�슜
					File file = new File("C:/images/" + fileName);
					uploadfile.transferTo(file);
				} catch (IOException e) {
					e.printStackTrace();
				} // try - catch
			} // if
			// �뜲�씠�꽣 踰좎씠�뒪 泥섎━瑜� �쁽�옱 �쐞移섏뿉�꽌 泥섎━
			return "redirect:getBoardList.do"; // 由ъ뒪�듃 �슂泥��쑝濡� 蹂대궡�빞�븯�뒗�뜲 �씪�떒 �젣�쇅�븯怨� 援ы쁽
		}
		*/
	}
	
	
	
	

