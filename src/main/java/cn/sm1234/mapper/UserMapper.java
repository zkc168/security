package cn.sm1234.mapper;


import cn.sm1234.domain.Permission;
import cn.sm1234.domain.User;

import java.util.List;

public interface UserMapper {
    //查询用户对象
    public User findByUsername(String username);

    //查询当前用户拥有的权限
    public List<Permission> findPermissionByUsername(String username);
}
