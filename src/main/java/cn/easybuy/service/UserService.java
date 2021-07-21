package cn.easybuy.service;

import cn.easybuy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserService {

    //登录判断：根据账号来获得用户信息
    public User getUserByLoginName(String loginName);

}
