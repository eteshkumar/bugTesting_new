package com.iris.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iris.daos.UserDao;
import com.iris.models.Project;
import com.iris.models.User;
import com.iris.service.ProjectService;
import com.iris.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String LogInForm() {
		return "LogInForm";
		
}
	@Autowired
	HttpSession session;
	@Autowired
	ProjectService projectService;
	
	@RequestMapping(value= {"LogOut"}, method=RequestMethod.GET)
    public String logout() {
                session.removeAttribute("uObj");
                session.invalidate();
                return "LogInForm";
    }

	
	@RequestMapping(value="/LogIn",method=RequestMethod.POST)
	public ModelAndView validate(@RequestParam int userid,@RequestParam String password) {
		User uObj=userService.validate(userid, password);
		if(uObj==null) {
			ModelAndView mv=new ModelAndView("LogInForm");
			mv.addObject("Login Invalid!",uObj);
			return mv;
		}
		if(uObj!=null) {
			String Desg=uObj.getDesignation();
			session.setAttribute("uObj", uObj);
			if(Desg.equals("Manager")) {
				List<Project> project=projectService.getAllProject();
				List<User> developerList=userService.getAllDeveloper();				
				List<User> testerList=userService.getAllTesterI();				
				ModelAndView mv=new ModelAndView("ManagerAllocationPage");
				mv.addObject("ProjectList",project);
				mv.addObject("developerList",developerList);
				mv.addObject("testerList", testerList);
				return mv;
			}
			else if(Desg.equals("Developer")){
				int id=uObj.getUserid();
				User developerObj=userService.getUserById(id);
				List<Project> ProjectList=developerObj.getProject();
				ModelAndView mv=new ModelAndView("DeveloperLogIn");
				mv.addObject("ProjectList",ProjectList);
				return mv;
				
			}
			else if(Desg.equals("Tester")) {
				int id=uObj.getUserid();
				System.out.println("id : "+id);
				User testerObj=userService.getUserById(id);
				List<Project> ProjectList=testerObj.getProject();
				System.out.println("Project List : "+ProjectList);
				
				ModelAndView mv=new ModelAndView("TesterLogIn");
				mv.addObject("ProjectList",ProjectList);
				return mv;
			}
		}
		return new ModelAndView("LogInForm");
	}
	
	}
