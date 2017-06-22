package cn.cookie.bigdata.web;

import cn.cookie.bigdata.entity.BehaviorLog;
import cn.cookie.bigdata.service.BehaviorLogService;
import cn.cookie.bigdata.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2017/6/22 0022.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Resource
    BehaviorLogService behaviorLogService;
    @Resource
    UserService userService;

    @RequestMapping(value = "login")
    public @ResponseBody List login() {
        return null;
    }

    @RequestMapping(value = "saveAction", method = RequestMethod.POST)
    public void saveAction(BehaviorLog behaviorLog) {
        behaviorLogService.insert(behaviorLog);
    }

    @RequestMapping(value = "listUser", method = RequestMethod.GET)
    public @ResponseBody Object listUser() {
        return userService.getAll();
    }
}
