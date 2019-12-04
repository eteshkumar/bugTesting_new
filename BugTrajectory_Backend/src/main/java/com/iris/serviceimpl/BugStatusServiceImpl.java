package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.BugStatusDao;
import com.iris.daos.ProjectDao;
import com.iris.models.BugStatus;
import com.iris.service.BugStatusService;

@Service("bugStatusService")
@Transactional

public class BugStatusServiceImpl  implements BugStatusService{


	@Autowired
	BugStatusDao bugStatusDao;
	
	public List<BugStatus> getAllBugStatus() {
		return bugStatusDao.getAllBugStatus();
	}
	

}
