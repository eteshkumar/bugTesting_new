//package com.iris.controller;
//
//import java.util.List;
//
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.iris.models.BugAllocationDetail;
//import com.iris.models.User;
//import com.iris.service.BugAllocationDetailService;
//
//
//
//@Controller
//public class DeveloperController {
//	@Autowired
//	HttpSession session;
//	@Autowired
//    BugAllocationDetailService bugAllocationDetailService; 
//	
//	@Autowired
//	BugAllocationDetail bugAllocationDetail;
//	
//	@RequestMapping(value="/assigned",method=RequestMethod.POST)
//	public ModelAndView getBugAssigned(ModelMap map)
//	{
//		User uObj=(User)session.getAttribute("uObj");
//		int id=uObj.getUserid();
//		 List<BugAllocationDetail> bugAllocationDetailList= bugAllocationDetailService.getAllBugDescription();
//		//List<BugAllocationDetail> bugAllocationList=bugAllocationDetailService.getBugDescription(id);
//		ModelAndView mv=new ModelAndView("BugAssigningToDeveloper");
//		//mv.addObject("bugAllocationList",bugAllocationList);
//		return mv;
//	}
//
//}
