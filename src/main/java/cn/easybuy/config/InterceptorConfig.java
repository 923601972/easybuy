package cn.easybuy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private OneInterceptor myInterceptor1;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加要拦截的url                1                 拦截的路径                                    放行的路径
        registry.addInterceptor(myInterceptor1).addPathPatterns("/**").excludePathPatterns("/login/*");
    }
}