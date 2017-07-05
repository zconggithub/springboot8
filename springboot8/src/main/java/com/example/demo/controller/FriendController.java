package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.ConstantPages;
import com.example.demo.entity.Friend;
import com.example.demo.service.FriendService;

@Controller
//@RequestMapping("/Friend")
public class FriendController {

	
	@Autowired
	private FriendService friendService;
	/**
	 * 通过model，返回界面方式（一）
	 * @param model
	 * @param ftel
	 * @return
	 */
	@RequestMapping("/getOne1")
	public String getOne1(Model model,String ftel){
		Friend friend=friendService.selectByFtel(ftel);
		model.addAttribute("friend", friend);
		return "index";
	}
	/**
	 * 通过request，返回界面方式（二）
	 * @param model
	 * @param ftel
	 * @return
	 */
	@RequestMapping("/getOne")
	public String getOne(HttpServletRequest request){
		String f=request.getParameter("ftel");
		Friend friend=friendService.selectByFtel(f);
		request.setAttribute("friend", friend);
		return "index";
	}
}
