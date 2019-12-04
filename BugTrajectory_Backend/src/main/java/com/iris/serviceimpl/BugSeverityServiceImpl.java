package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.BugSeverityDao;
import com.iris.models.BugSeverity;
import com.iris.service.BugSeverityService;
@Service("bugSeverityService")
@Transactional
public class BugSeverityServiceImpl implements BugSeverityService {
	
	@Autowired
	BugSeverityDao bugSeverityDao;

	public List<BugSeverity> getBugSeverity() {
		
		return bugSeverityDao.getBugSeverity();
	}

}
