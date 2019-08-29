package service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.test_Dao;
import model.test;
import service.test_service;

@Service
public class test_service_Impl implements test_service {
	@Autowired
	test_Dao dao;

	public List<test> selectbyname(String txt) {
		return dao.selectbyname(txt);
	}
	
}
