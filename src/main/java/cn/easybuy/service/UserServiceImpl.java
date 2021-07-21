package cn.easybuy.service;

import cn.easybuy.dao.UserDao;
import cn.easybuy.pojo.User;
import cn.easybuy.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserByLoginName(String loginName) {
        return userDao.getUserByLoginName(loginName);
    }
}
