package cn.cookie.bigdata.interceptor;

import cn.cookie.bigdata.entity.User;
import cn.cookie.bigdata.service.UserService;
import cn.cookie.bigdata.utils.SessionUtils;
import com.incooltech.common.util.HttpClientUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * Created by qiancai on 2015/01/04 0027.
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    String openId = "https://api.weixin.qq.com/sns/jscode2session?" +
            "appid=wx390e9f8fb85e36d3&" +
            "secret=935141d34b9a24c7b0da06c0a4559605&" +
            "js_code=081r8TnI03Qktj29zBmI0k3InI0r8Tnb&" +
            "grant_type=authorization_code";

    @Resource
    UserService userService;

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        String openId = request.getHeader("openId");

        if (null != openId && !"".equals(openId)) {
            User userTemp = new User(openId);
            User user = userService.getOne(userTemp);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            SessionUtils.setUser(session);
        } else {
            HttpClientUtils.doGet(openId, null);
        }
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        logger.debug("进入postHandle");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.debug("进入afterCompletion");
    }

    public static void main(String[] a) throws Exception{
        //System.out.print(HttpClientUtils.doGet(openId, null));

        System.out.print(UUID.randomUUID().toString().replace("-", ""));
    }
}
