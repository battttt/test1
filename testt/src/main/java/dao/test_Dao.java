package dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import model.test;

@Repository
public interface test_Dao { 
	@Select(" select id,name from test where name like '%${txt}%' ")
	public List<test> selectbyname(@Param("txt")String txt);

	@Select(" delete  from test where id= #{id} ")
	public void delete(@Param("id")int id);

	@Insert(" insert into test(name) values(#{name}) ")
	public void insert(test t);

	@Select(" select * from test where id = #{id} ")
	public test selectbyid(Integer id);

	@Update(" update test set name= #{name} where id= #{id} ")
	public void update(test t);
	
	
}
