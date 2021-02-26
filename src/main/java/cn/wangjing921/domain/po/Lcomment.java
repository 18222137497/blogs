package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 评论表
 * @author afflatus
 */
@Data
public class Lcomment implements Serializable {
    private static final long serialVersionUID = 3051317291932740493L;
    /**
     * 主键，可起排序作用
     */
    private Integer lcoid;

    /**
     * 评论者id
     */
    private Integer fromuid;

    /**
     * 评论的时间
     */
    private Date commentdate;

    /**
     * 评论内容
     */
    private String icommenttext;

    /**
     * 来源于那篇博客低下
     */
    private Integer toblogid;

}