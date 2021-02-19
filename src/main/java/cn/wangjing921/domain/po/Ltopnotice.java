package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 首页公告轮播图
 * @author afflatus
 */
@Data
public class Ltopnotice implements Serializable {
    /**
     * 主键，有排序作用
     */
    private Integer ltopnoticeid;

    /**
     * 图片路径
     */
    private String ltopnoticeimg;

    /**
     * 标题
     */
    private String ltopnoticetitle;

    /**
     * 内容
     */
    private String ltopnoticedata;

    /**
     * 发布时间
     */
    private Date sendtime;

    /**
     * 可能需要跳转其他网页的url，或者内部的一个对外url(灵活暂定)
     */
    private String ltopnoticeurl;

    private static final long serialVersionUID = 1L;
}