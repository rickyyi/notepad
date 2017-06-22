package cn.cookie.bigdata.dto.response;

import lombok.Data;

/**
 * Created by 845477519@qq.com on 2017/6/22 0022.
 */
@Data
public class NoteResponse {
    private Long id;
    private String title;
    private String category;
    private Long updateTime;
    private String text;
}
