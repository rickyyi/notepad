package cn.cookie.bigdata.web;

import cn.cookie.bigdata.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
public class BaseController {

    ThreadLocal<User> userLocal = new ThreadLocal<User>();

    public void getUser(HttpServletRequest request) {
        User user = (User)request.getSession().getAttribute("user");
        userLocal.set(user);
    }
}
