package com.iris.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.BugTypeDao;
import com.iris.models.BugType;
import com.iris.service.BugTypeService;

@Service("bugTypeService")
@Transactional

public class BugTypeServiceImpl implements BugTypeService {
	
	@Autowired
	BugTypeDao bugTypeDao;

	public List<BugType> getAllBug() {
		return bugTypeDao.getAllBug();
		
	}

}
