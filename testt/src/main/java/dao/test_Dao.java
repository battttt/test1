package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.test;

@Repository
public interface test_Dao { 
	@Select("select id,name from test where name like '%${txt}%' ")
	public List<test> selectbyname(@Param("txt")String txt);
}
