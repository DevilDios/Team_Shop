
package com.mycom.team;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class BlossomController {

	@Autowired
	public SqlSession sqlSession;
	
	//유저-회원정보수정폼
	@RequestMapping(value = "/user_modify_form")
	public String user_modify()
	{
		return "user_modify_form";
	}
	
	//유저-회원정보수정
	@RequestMapping(value = "/user_modify_update")
	public String user_modify_update(Member_DTO dto, Model model)
	{
		Service dao = sqlSession.getMapper(Service.class);
		dao.setUserModify(dto.getId(), dto.getPw(), dto.getName(), dto.getTel(), dto.getEmail(), dto.getAddress());
		model.addAttribute("id",dto.getId());
		model.addAttribute("pw",dto.getPw());
		return "redirect: loginproc";
	}
	
	//유저-회원탈퇴
	@RequestMapping(value = "/user_delete")
	public String user_delete(Member_DTO dto)
	{
		String id = dto.getId();
		Service dao = sqlSession.getMapper(Service.class);
		dao.userDelete(id);
		return "redirect: logout";
	}
		
	//관리자-index_header/main
	@RequestMapping(value = "/managerindex")
	public String manager()
	{
		return "managerindex";
	}

	//관리자-회원관리
	@RequestMapping("/manager_memlist")
	public String noticeList(PageVO vo, Model model
			, @RequestParam(value="nowPage", required=false)String nowPage
			, @RequestParam(value="cntPerPage", required=false)String cntPerPage) 
	{
		Service noce = sqlSession.getMapper(Service.class);
		int total = noce.cntNotice();//count 테이블 안에 전체 행 개수 반환
		
		if (nowPage == null && cntPerPage == null) {
			nowPage = "1";
			cntPerPage = "5";
		} else if (nowPage == null) {
			nowPage = "1";
		} else if (cntPerPage == null) { 
			cntPerPage = "5";
		}
		
		vo = new PageVO(total, Integer.parseInt(nowPage), Integer.parseInt(cntPerPage));
		model.addAttribute("paging", vo);
		model.addAttribute("viewAll", noce.selectNotice(vo));
		
		return "manager_memlist";
	}
	

	//관리자-회원정보수정폼
	@RequestMapping(value = "/manager_memmodify_form")
	public String member_modify(HttpServletRequest request, Model model)
	{
		String id = request.getParameter("id");
		Service dao = sqlSession.getMapper(Service.class);
		Member_DTO dto = dao.getMemModify(id);
		model.addAttribute("dto", dto);
		return "manager_memmodify_form";
	}
	
	//관리자-회원정보삭제
	@RequestMapping(value = "/manager_memdelete")
	public String manager_memdelete(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		Service dao = sqlSession.getMapper(Service.class);
		dao.memberDelete(id);
		return "redirect: manager_memlist";	
	}
	
	//관리자-회원정보수정
	@RequestMapping(value = "/manager_memmodify_update")
	public String manager_memmodify_update(Member_DTO dto)
	{
		Service dao = sqlSession.getMapper(Service.class);
		dao.setMemModify(dto.getId(), dto.getPw(), dto.getName(), dto.getTel(), dto.getEmail(), dto.getAddress());
		return "redirect: manager_memlist";
	}
			
	//로그인폼
	@RequestMapping(value = "/loginform")
	public String login()
	{
		return "loginform";
	}
			
	//로그인처리
	@RequestMapping(value = "/loginproc")
	public String loginproc(HttpServletRequest request, RedirectAttributes res)
	{	
		String id=request.getParameter("id");
		String pw=request.getParameter("pw");
		Service dao = sqlSession.getMapper(Service.class);
		Member_DTO member =dao.getLoginMember(id,pw);
		
		if(member !=null) 
		{
			HttpSession hs =request.getSession();
			hs.setAttribute("loginmember", member);
			hs.setAttribute("islogon", true);
			return "redirect: index"; 
		}
		else
		{
			res.addAttribute("result","loginfail");
			return "redirect:loginform"; 
		}	
	}
			
	//로그아웃
	@RequestMapping(value = "/logout")
	public String logout(HttpServletRequest request , Model mo) 
	{
		HttpSession hs = request.getSession();
		hs.removeAttribute("loginmember");
		hs.removeAttribute("islogon");
		return "redirect: index";		
	}

	
	
	//결제 페이지 결제하는곳
	@RequestMapping(value = "/orderr",method = RequestMethod.GET)
	public String order1(HttpServletRequest re,Model mo)
	{
		//Giftimg, gifttitle, orders, orderm, orderl, ordertotalprice
		//데이터 전송해야함
		//결제하기
		Service dao = sqlSession.getMapper(Service.class);
	
		String gifttitle= re.getParameter("gifttitle");
		int giftprice = Integer.parseInt(re.getParameter("giftprice"));
		System.out.println("상품번호"+gifttitle);
		//String giftsize = re.getParameter("giftsize");
		int amount = Integer.parseInt(re.getParameter("amount"));
		String giftsize = re.getParameter("giftsize");
		int tot= amount*giftprice;
		
		String giftimg = re.getParameter("giftimg");
	     
		ArrayList<Gift_DTO> list = dao.ordero(gifttitle);
		
		mo.addAttribute("list", list);
		mo.addAttribute("amount",amount);
		mo.addAttribute("giftimg",giftimg);
		mo.addAttribute("tot",tot);
		mo.addAttribute("giftsize",giftsize);
		return "order";
	}	
	
	//결제 완료 처리
	@RequestMapping(value = "/paid", method = RequestMethod.POST)
	public String paid(HttpServletRequest request)
	{
		String id = request.getParameter("id");
		int giftnum = Integer.parseInt(request.getParameter("giftnum"));
		String orderstatus = request.getParameter("orderstatus");
		int orders = Integer.parseInt(request.getParameter("orders"));
		int orderm = Integer.parseInt(request.getParameter("orderm"));
		int orderl = Integer.parseInt(request.getParameter("orderl"));
		
		Service dao = sqlSession.getMapper(Service.class);
		dao.setGiftOrder(id, giftnum, orderstatus, orders, orderm, orderl); //giftorder 테이블 초기화
		
		return "paid"; //결제완료 페이지출력시키기
	}
	
	//주문목록 리스트
	@RequestMapping(value = "order_list")
	public String order_list(HttpServletRequest request, Model model)
	{
		Service dao = sqlSession.getMapper(Service.class);
		String id = ((Member_DTO)request.getSession().getAttribute("loginmember")).getId();
		ArrayList<Order_list_DTO> oldto = dao.getOrderListDTO(id);
		model.addAttribute("oldto", oldto);
		return "order_list";
	}
		
	@RequestMapping(value = "/cart_userset")
	public String cart_userset(HttpServletRequest request)
	{
		
		
		String id = request.getParameter("id");
		int giftnum = Integer.parseInt(request.getParameter("giftnum"));
		String giftstatus = "cart";
		int orders = Integer.parseInt(request.getParameter("orders"));
		int orderm = Integer.parseInt(request.getParameter("orderm"));
		int orderl = Integer.parseInt(request.getParameter("orderl"));

		Service dao = sqlSession.getMapper(Service.class);
		dao.cartUserSet(id, giftnum, giftstatus, orders, orderm, orderl);
		
		return "cart_list";
	}
	
	@RequestMapping(value = "/cart_list")
	public String cart_list(HttpServletRequest request, Model model)
	{
		Service dao = sqlSession.getMapper(Service.class);
		String id = ((Member_DTO)request.getSession().getAttribute("loginmember")).getId(); 
		ArrayList<Order_list_DTO> oldto = dao.getCartListDTO(id);
		model.addAttribute("oldto", oldto);		
		return "cart_list";
	}
	
	@RequestMapping(value = "cart_delete")
	public String cart_delete(HttpServletRequest request)
	{
		String id = ((Member_DTO)request.getSession().getAttribute("loginmember")).getId(); 
		int giftnum = Integer.parseInt(request.getParameter("giftnum"));
		Service dao = sqlSession.getMapper(Service.class);	
		dao.cartDelete(id, giftnum);
		return "redirect: cart_list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




























