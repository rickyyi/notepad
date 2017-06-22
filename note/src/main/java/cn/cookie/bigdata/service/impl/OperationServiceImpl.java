package cn.cookie.bigdata.service.impl;

import cn.cookie.bigdata.dao.NoteDao;
import cn.cookie.bigdata.entity.Category;
import cn.cookie.bigdata.entity.Note;
import cn.cookie.bigdata.entity.User;
import cn.cookie.bigdata.service.CategoryService;
import cn.cookie.bigdata.service.NoteService;
import cn.cookie.bigdata.service.OperationService;
import cn.cookie.bigdata.utils.SessionUtils;
import com.incooltech.framework.dto.ResponseEntity;
import com.incooltech.framework.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
@Service
public class OperationServiceImpl extends BaseServiceImpl<Note> implements OperationService {

    @Resource
    NoteService noteService;
    @Resource
    NoteDao noteDao;


    public ResponseEntity insertFolder(Category category) {
        return null;
    }

    public ResponseEntity deleteFolder(Category category) {
        return null;
    }

    public ResponseEntity updateFolder(Category category) {
        return null;
    }

    public ResponseEntity listFolder() {
        return null;
    }

    public ResponseEntity insertNote(Note note) {
        return null;
    }

    public ResponseEntity deleteNote(Long noteId) {
        return null;
    }

    public ResponseEntity updateNote(Note note) {
        return null;
    }

    public ResponseEntity listNote() {
        return null;
    }

    public ResponseEntity getRecentlyNote() {
        User user = SessionUtils.getUser();
        Long userId = 1L;
        if (null != user) {
            userId = user.getId();
        }
        return new ResponseEntity(ResponseEntity.STATUS_FAIL, noteDao.getRecentlyNote(userId));
    }
}
