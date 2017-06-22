package cn.cookie.bigdata.web;

import cn.cookie.bigdata.entity.Category;
import cn.cookie.bigdata.entity.Note;
import cn.cookie.bigdata.service.NoteService;
import cn.cookie.bigdata.service.UserService;
import com.incooltech.framework.dto.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
import java.util.UUID;

/**
 * Created by Administrator on 2017/3/14 0014.
 */
@Controller
@RequestMapping("note")
public class NoteController {

    @Resource
    NoteService noteService;

    @RequestMapping(value = "get/{uuid}")
    public @ResponseBody ResponseEntity get(@PathVariable String uuid) {
        Note note = new Note();
        note.setUuid(uuid);
        return new ResponseEntity(ResponseEntity.STATUS_OK, noteService.getOne(note));
    }

    @RequestMapping()
    protected ResponseEntity insert(Note note) {
        note.setUuid(UUID.randomUUID().toString());
        noteService.insert(note);
        return new ResponseEntity(ResponseEntity.STATUS_OK);
    }
}
