package cn.cookie.bigdata.entity;

import com.alibaba.fastjson.JSON;
import com.incooltech.framework.entity.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Table;
import java.util.List;

/**
 * Created by 845477519@qq.com on 2016/11/22 0022.
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Table(name = "behavior_log")
public class BehaviorLog extends BaseEntity {
    private Long userId;
    private String page;
}
