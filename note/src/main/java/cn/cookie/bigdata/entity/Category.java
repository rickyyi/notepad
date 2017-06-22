package cn.cookie.bigdata.entity;

import com.incooltech.framework.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Table;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Table(name = "category")
public class Category extends BaseEntity {
    private Long userId;
    private String name;
    private Integer deleteFlag;
}
