package cn.easybuy.dao;

import cn.easybuy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {

    //登录判断：根据账号来获得用户信息
    public User getUserByLoginName(@Param("loginName") String loginName);









}
