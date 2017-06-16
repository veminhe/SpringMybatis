package com.tronker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tronker.dao.TestDao;
import com.tronker.entity.TestBean;

@Service
public class TestService {
	
	@Autowired
	private TestDao testDao;
	
	public List<TestBean> getTest(String id){
		return testDao.getTest(id);
	}
}
