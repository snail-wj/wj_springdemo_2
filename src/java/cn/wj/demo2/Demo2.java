package cn.wj.demo2;

import cn.wj.demo1.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by WJ on 2017/10/17
 */
//通过以下注解，就不需要通过工厂加载配置文件了
//运行的这个类，由SpringJUnit4ClassRunner来运行
@RunWith(SpringJUnit4ClassRunner.class)
//加载配置文件，一起拿都是在web.xml中配置，现在我们可以用注解的方式来配置
@ContextConfiguration("classpath:applicationContext.xml")
public class Demo2 {

    @Resource(name="userService")
    private UserService userService;

    @Test
    public void sayHello(){
        userService.sayHello();
    }
}
