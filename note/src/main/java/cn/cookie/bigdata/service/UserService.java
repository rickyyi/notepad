package cn.cookie.bigdata.service;


import cn.cookie.bigdata.entity.User;
import com.incooltech.framework.service.BaseService;

import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
public interface UserService extends BaseService<User> {
    public String sayHello(String username);

    public List get();
}
