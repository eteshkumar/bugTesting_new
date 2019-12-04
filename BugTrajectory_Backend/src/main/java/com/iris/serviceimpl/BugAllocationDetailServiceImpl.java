package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.BugAllocationDetailDao;
import com.iris.models.BugAllocationDetail;
import com.iris.service.BugAllocationDetailService;

@Service("bugAllocationDetailService")
@Transactional


public class BugAllocationDetailServiceImpl implements BugAllocationDetailService {
	@Autowired
	BugAllocationDetailDao bugAllocationDetailDao;
	
	public boolean saveBugDetails(BugAllocationDetail bugAllocate) {
	return bugAllocationDetailDao.saveBugDetails(bugAllocate);
	}
	public List<BugAllocationDetail> getAllBugDescription() {
		return  bugAllocationDetailDao.getAllBugDescription();
	}
	public BugAllocationDetail getBugAllocationById(int bugAllocationId) {
		return  bugAllocationDetailDao.getBugAllocationById(bugAllocationId);
	}
	public boolean update(BugAllocationDetail bugAllocation) {
		return  bugAllocationDetailDao.update(bugAllocation);
	}
	public List<BugAllocationDetail> getBugDescription(int id) {
		return bugAllocationDetailDao.getBugDescription(id);
		
	}

}
