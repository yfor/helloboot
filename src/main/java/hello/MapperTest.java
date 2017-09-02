package hello;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperTest {


    @Select("SELECT * FROM accounts WHERE id = #{id}")
    Accounts findByid(@Param("id") int id);

    @Select("SELECT * FROM t WHERE id = #{id}")
    Test findByidt(@Param("id") int id);
}