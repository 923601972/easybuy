package cn.easybuy.controller;

import cn.easybuy.pojo.User;
import cn.easybuy.service.UserService;
import com.alibaba.fastjson.JSON;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/login/dologin",method = RequestMethod.POST)
    @ResponseBody
    public String dologin(String loginName, String password, HttpSession session){
        User user = userService.getUserByLoginName(loginName);
        Map<String,Object> map = new HashMap<>();
        if(user != null){
            if(!user.getPassword().equals(password)){
                //密码错误
                map.put("result","false");
            }else {
                //登录成功
                map.put("result","true");
                //根据电脑运行状况生成随机身份令牌
                String token = UUID.randomUUID()+"";
                //存到redis
                redisTemplate.opsForValue().set(token,user, Duration.ofMinutes(30L));//设置过期时间30分钟
                map.put("token",token);
            }
        }else {
            map.put("result","null");
        }
        return JSON.toJSONString(map);
    }

    //从前端获取令牌
    //通过令牌从redis中获得用户信息
    @GetMapping("/login/getUserOfLogin")
    public String getUserOfLogin(HttpServletRequest request){
        //获取Headers中的head
        String token = request.getHeader("token");

        Map<String,Object> map = new HashMap<>();

        Object user = redisTemplate.opsForValue().get(token);
        if(user != null){
            map.put("user",user);
            return JSON.toJSONString(map);
        }else {
            return null;
        }

    }





}
