package cn.wj.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by WJ on 2017/10/17.
 */
public class Demo1 {

    @Test
    public void run1(){
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    /**
     * 注解的方式
     */
    @Test
    public void run2(){
        // 创建工厂，加载p配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        UserService userService = (UserServiceImpl)ac.getBean("userService");
        // 调用对象的方法执行
        userService.sayHello();
    }

    /**
     * 注解的方式,注解引入对象
     */
    @Test
    public void run3(){
        // 创建工厂，加载p配置文件，CustomerDaoImpl创建了，CustomerServiceImpl创建了
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 从工厂中获取对象
        UserService userService = (UserServiceImpl)ac.getBean("userService");
        // 调用对象的方法执行
        userService.save();
    }
}
