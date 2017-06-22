package cn.cookie.bigdata.dao;


import cn.cookie.bigdata.entity.Note;
import cn.cookie.bigdata.entity.User;
import com.incooltech.framework.dao.BaseDao;

import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
public interface NoteDao extends BaseDao<Note> {

    List<Note> getRecentlyNote(Long userId);



}
