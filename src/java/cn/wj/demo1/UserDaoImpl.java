package cn.wj.demo1;

import org.springframework.stereotype.Repository;

/**
 * UserDaoImpl交给IOC的容器创建
 * Created by WJ on 2017/10/17
 */
@Repository(value = "userDao")
public class UserDaoImpl implements UserDao {
    public void save() {
        System.out.println("保存数据");
    }
}
