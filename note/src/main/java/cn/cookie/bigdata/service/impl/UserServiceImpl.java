package cn.cookie.bigdata.service.impl;

import cn.cookie.bigdata.dao.UserDao;
import cn.cookie.bigdata.entity.User;
import cn.cookie.bigdata.service.UserService;
import com.incooltech.framework.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Resource
    UserDao userDao;

    public String sayHello(String username) {
        System.out.print("Hello World! " + username);
        return "I am return: " + username;
    }

    public List<User> get() {
        return userDao.getAll();
    }
}
