package com.iris.daosImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.BugAllocationDetailDao;
import com.iris.models.BugAllocationDetail;

@Repository("bugAllocationDetail")
public class BugAllocationDetailDaoImpl implements BugAllocationDetailDao{
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean saveBugDetails(BugAllocationDetail bugAllocate) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(bugAllocate);
			return true;	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}


	public List<BugAllocationDetail> getAllBugDescription() {
	try {
		Session session=sessionFactory.getCurrentSession();
		Query q=session.createQuery("from com.iris.models.BugAllocationDetail");
		List<BugAllocationDetail> bugAllocationDetailList=q.list();
		return  bugAllocationDetailList;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return null;
	}


	public BugAllocationDetail getBugAllocationById(int bugAllocationId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			BugAllocationDetail bugAllocationDetail=session.get(BugAllocationDetail.class,bugAllocationId);
			return bugAllocationDetail;	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	public boolean update(BugAllocationDetail bugAllocation) {
		try {
		Session session=sessionFactory.getCurrentSession();
		session.update(bugAllocation);
		return true;	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return false;
	
	}


	public List<BugAllocationDetail> getBugDescription(int id) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query q=session.createQuery("from com.iris.models.BugAllocationDetail");
			List<BugAllocationDetail> bugAllocationDetailList=q.list();
			return  bugAllocationDetailList;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;


	}
}
