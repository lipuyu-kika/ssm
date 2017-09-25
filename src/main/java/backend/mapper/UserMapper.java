package backend.mapper;

import org.apache.ibatis.annotations.Select;

import backend.dao.User;

import java.util.List;

public interface UserMapper {
    @Select("select id, name from user")
    List<User> select();
}
