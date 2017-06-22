package cn.cookie.bigdata.web;

import cn.cookie.bigdata.entity.Category;
import cn.cookie.bigdata.service.CategoryService;
import cn.cookie.bigdata.service.NoteService;
import cn.cookie.bigdata.service.OperationService;
import cn.cookie.bigdata.service.UserService;
import com.incooltech.framework.dto.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2017/6/22 0022.
 */
@Controller
@RequestMapping("operation")
public class OperationController extends BaseController {
    @Resource
    OperationService operationService;


    @RequestMapping(value = "saveFolder")
    public @ResponseBody Object saveFolder(Category category) {
        return operationService.insertFolder(category);
    }

    @RequestMapping(value = "deleteFolder")
    public @ResponseBody ResponseEntity deleteFolder(Category category) {
        return operationService.deleteFolder(category);
    }

    @RequestMapping(value = "getRecentlyNote")
    public @ResponseBody ResponseEntity getRecentlyNote() {
        return operationService.getRecentlyNote();
    }
}
