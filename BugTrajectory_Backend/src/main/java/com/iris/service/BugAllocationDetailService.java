package com.iris.service;

import java.util.List;

import com.iris.models.BugAllocationDetail;

public interface BugAllocationDetailService {
	public boolean saveBugDetails(BugAllocationDetail bugAllocate);
	public List<BugAllocationDetail> getAllBugDescription();
	public BugAllocationDetail getBugAllocationById(int bugAllocationId);
	public boolean update(BugAllocationDetail bugAllocation);
	public List<BugAllocationDetail> getBugDescription(int id);

}
