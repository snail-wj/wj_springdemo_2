package cn.wj.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * Created by WJ on 2017/10/17
 */

/**
 *  主键注解，标记类
 *  <bean  id="userService" class="cn.wj.demo1.UserServiceImpl" /> = @Component(value = "userService")
 */
@Component(value = "userService")
//@Scope(value = "prototype")
public class UserServiceImpl implements UserService {

    //@Autowired 按类型自动装配(这个的类的类型)，但是这个不好，如果一个接口有多个实现类的话，可以注入的就有问题，我们可以按照名称注入
    //@Autowired
    //@Qualifier(value = "userDao")  //这个按照名称注入，就是dao的bean的id的值，这两个一起共用
    //private UserDao userDao;

    //java的注解，spring的框架支持这个注解，这个是按照bean的id来进行注入
    @Resource(name="userDao")
    private UserDao userDao;

    // 给那么属性注入王京字符串，setName的方法可以省去不写
    @Value("wangjing")
    private String name;

    public void sayHello() {
        System.out.println("Hello "+ name);
    }

    public void save() {
        userDao.save();
    }

    @PostConstruct
    public void init(){
        System.out.println("初始化...");
    }

    @PreDestroy
    public void destory(){
        System.out.println("消失...");
    }


}
