package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;

import cn.wangjing921.custenum.domainTypeEnum.BlogRemarkEnum;
import cn.wangjing921.custenum.domainTypeEnum.BlogStateEnum;
import lombok.Data;

/**
 * 博客表
 * @author afflatus
 */
@Data
public class Lblog implements Serializable {

    private static final long serialVersionUID = -5102922798758218085L;
    /**
     * 主键，起排序作用
     */
    private Integer lblogid;

    /**
     * 标题
     */
    private String title;

    /**
     * 所属用户id
     */
    private Integer lbloguid;

    /**
     * 点赞数
     */
    private Integer lblognice;

    /**
     * 评论数

     */
    private Integer lbogcomment;

    /**
     * 博客ossurl
     */
    private String blogurl;

    /**
     * 浏览数
     */
    private Integer lbloglook;

    /**
     * 发布时间
     */
    private Date sendtime;

    /**
     * 是否过审，0未过，1过了
     */
    private BlogStateEnum live;

    /**
     * 分类
     */
    private Integer classifyid;

    /**
     * 备注，对应精品，置顶
     */
    private BlogRemarkEnum remark;


}