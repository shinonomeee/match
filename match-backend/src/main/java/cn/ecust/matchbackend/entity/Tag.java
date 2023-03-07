package cn.ecust.matchbackend.entity;

import com.baomidou.mybatisplus.annotation.*;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 标签
 * @TableName tag
 */
@TableName(value ="tag")
@Data
@EqualsAndHashCode(callSuper = true)
public class Tag extends BaseModel {

    /**
     * 标签名
     */
    private String tagName;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 父标签id
     */
    private Long parentId;

    /**
     * 是否为父标签，0-否 1-是
     */
    private Integer isParent;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}