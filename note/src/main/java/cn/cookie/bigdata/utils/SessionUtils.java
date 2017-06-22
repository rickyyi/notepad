package cn.cookie.bigdata.utils;

import cn.cookie.bigdata.entity.User;

import javax.servlet.http.HttpSession;

/**
 * Created by 845477519@qq.com on 2017/6/22 0022.
 */
public class SessionUtils {
    private static ThreadLocal<User> userThreadLocal = new ThreadLocal<User>();

    public static User getUser() {
        return userThreadLocal.get();
    }

    public static void setUser(HttpSession session) {
        User user = (User)session.getAttribute("user");
        userThreadLocal.set(user);
    }
}
