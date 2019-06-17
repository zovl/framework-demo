package a.b.c;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserMapper {

    @Insert("INSERT INTO user (username, password) VALUES (#{username}, #{password})")
    void insert(User user);

    @Update("UPDATE user SET title = #{username}, password = #{password} WHERE id = #{id}")
    void updateById(User user);

    @Delete("DELETE FROM user WHERE id = #{id}")
    void deleteById(long id);

    @Select("SELECT * FROM user WHERE id = #{id}")
    User selectById(long id);

    @Select("SELECT * FROM user")
    List<User> selectAll();
}