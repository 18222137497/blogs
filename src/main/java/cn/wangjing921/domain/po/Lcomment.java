package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 评论表
 */
@Data
public class Lcomment {
    private Integer lcoid;
    private Integer fromuid;//评论人id
    private Date commentdate;//评论时间
    private String icommenttext;//评论内容
    private Integer toblogid;//在那个博客下
}
