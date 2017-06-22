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
@Table(name = "user")
public class User extends BaseEntity {

    private String openId;
    private String nickName;
    private String avatarUrl;
    private Integer gender;
    private String province;
    private String city;
    private String country;

    public User(String openId) {
        this.openId = openId;
    }

    public User() {
    }
}
