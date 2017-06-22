package cn.cookie.bigdata.service;


import cn.cookie.bigdata.entity.Category;
import cn.cookie.bigdata.entity.Note;
import com.incooltech.framework.dto.ResponseEntity;
import com.incooltech.framework.service.BaseService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
public interface OperationService extends BaseService<Note> {

    ResponseEntity insertFolder(Category category);
    ResponseEntity deleteFolder(Category category);
    ResponseEntity updateFolder(Category category);
    ResponseEntity listFolder();

    ResponseEntity insertNote(Note note);
    ResponseEntity deleteNote(Long noteId);
    ResponseEntity updateNote(Note note);
    ResponseEntity listNote();

    ResponseEntity getRecentlyNote();
}
