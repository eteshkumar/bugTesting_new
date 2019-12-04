package com.iris.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iris.daos.UserDao;
import com.iris.models.BugAllocationDetail;
import com.iris.models.BugStatus;
import com.iris.models.Project;
import com.iris.models.User;
import com.iris.service.BugAllocationDetailService;
import com.iris.service.BugStatusService;
import com.iris.service.ProjectService;
import com.iris.service.UserService;

@Controller
public class ManagerController {
    @Autowired
    UserService userService;
    @Autowired
    ProjectService projectService;
    
    @Autowired
    BugAllocationDetailService bugAllocationDetailService; 
    
    @Autowired
    HttpSession session;
    
    @Autowired
    BugStatusService bugStatusService;
    
    public boolean checkSession(ModelMap map) {
        if(session.getAttribute("uObj")==null) {
        map.addAttribute("msg","Session does not exist! Plz Login in first");
        return true;
        }
        return false;
        }


    
    @RequestMapping(value="/Manager",method=RequestMethod.POST)
      public ModelAndView getProjectAllocation(@RequestParam int project,@RequestParam(required=false) int[] Developer,@RequestParam(required=false) int[] Tester ,ModelMap map){	
        if(checkSession(map)) {
        	return new ModelAndView("LoginForm");
       
        }
        
    			Project pObj=projectService.getProjectById(project);
                 List<User> usersList=pObj.getUsers();
                 if(Developer!=null) {
                 for(int i:Developer) {     
                 User uObj=userService.getUserById(i);
                  uObj.getProject().add(pObj);
                   usersList.add(uObj);
                         }
                  }
                  if(Tester!=null) {
                  for(int i:Tester) {
                         User uObj=userService.getUserById(i);
                         uObj.getProject().add(pObj);
                         usersList.add(uObj);
                  }
                  }
                  pObj.setUsers(usersList);
                  projectService.updateProject(pObj);
                   List<Project> projectList=projectService.getAllProject();
                   List<User> devloperList=userService.getAllDeveloper();
                   List<User> testerList=userService.getAllTesterI();  
                    ModelAndView mv=new ModelAndView("ManagerAllocationPage");
                    mv.addObject("ProjectList",projectList);
                    mv.addObject("devoloperList",devloperList);
                    mv.addObject("testerList",testerList);
                    
                    return mv;

	}

   @RequestMapping(value="/ViewBugDetailPage",method=RequestMethod.GET)
    public ModelAndView getAllBugDescription(){
	   
	   
    	List<BugAllocationDetail> bugAllocationDetailList=bugAllocationDetailService.getAllBugDescription();
    	ModelAndView mv=new ModelAndView("ViewBugDetailPage");
    	mv.addObject("bugAllocationDetailList",bugAllocationDetailList);
    	session.setAttribute("bugAttribiute", bugAllocationDetailList);
    	return mv;
    }
   @RequestMapping(value="/ShowBugDetail/{bugAllocateId}",method=RequestMethod.GET)
   public ModelAndView assignBug(@PathVariable("bugAllocateId")int bugAllocateId) {
	   BugAllocationDetail bugAllocationDetail=bugAllocationDetailService.getBugAllocationById(bugAllocateId);
	   List<BugStatus> statusList=bugStatusService.getAllBugStatus();
	   List<User> developerList=userService.getAllDeveloper();
	   ModelAndView mv=new ModelAndView("AssignBug");
	   mv.addObject("developerList",developerList);
	   mv.addObject("bugAllocationDetail",bugAllocationDetail);
	   mv.addObject("statusList",statusList);
	   return mv;
	   
   }
   @RequestMapping(value="/assigned",method=RequestMethod.GET)
   public ModelAndView bugAssigned(@RequestParam int bugAllocateId,@RequestParam int developer,@RequestParam int projectId,@RequestParam String status,@RequestParam("plannedStartDate") @DateTimeFormat(pattern="yyyy-MM-dd")  Date plannedStartDate,@RequestParam("plannedEndDate") @DateTimeFormat(pattern="yyyy-MM-dd") Date plannedEndDate)
   {
	  
	   BugAllocationDetail bugAssign=bugAllocationDetailService.getBugAllocationById(bugAllocateId);
	   bugAssign.setBugAllocateId(bugAllocateId);
	   bugAssign.setUserid(developer);
	   bugAssign.setP_Id(projectId);
	   bugAssign.setStatusId(status);
	   bugAssign.setPlannedStartDate(plannedStartDate);
	   bugAssign.setPlannedEndDate(plannedEndDate);
	   bugAllocationDetailService.update(bugAssign);
	   List<BugAllocationDetail> bugAllocationDetailList= bugAllocationDetailService.getAllBugDescription();
	   ModelAndView mv=new ModelAndView("BugSucessFullyAssigned"); 
	   mv.addObject("bugAllocationDetailList",bugAllocationDetailList);
	   return mv;
	   
	   
   }
 
   

}
