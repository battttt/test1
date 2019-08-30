package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import model.test;

@Repository
public interface test_Dao {
	public List<test> selectbyname(@Param("txt")String txt);
}
