package service;

import java.util.List;

import model.test;

public interface test_service {
	public List<test> selectbyname(String txt);

	public void delete(int id);

	public void insert(test t);

	public test selectbyid(Integer id);

	public void update(test t);
}
