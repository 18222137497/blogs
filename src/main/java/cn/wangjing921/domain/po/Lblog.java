package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 博客表
 */
@Data
public class Lblog {
    private Integer lblogid;
    private String title;//标题
    private Integer lbloguid;//所属用户
    private Integer lblognice;//被点赞数
    private Integer lblogcpmment;//评论数
    private String lblogurl;//内容路径url
    private Integer lbloglook;//访问量
    private Date sendtime;//发送时间
    private Integer live;//过审状态
    private Integer classifyid;//分类id
    private Integer remark;//对应加精id

}
