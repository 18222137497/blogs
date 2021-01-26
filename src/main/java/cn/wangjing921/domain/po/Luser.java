package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 用户表
 */
@Data
public class Luser {
    private Integer luserid;
    private String username;
    private String password;
    private Integer phone;//手机号
    private Integer blognum;//发布博客数
    private Integer look;//被访问量
    private String label;//账号描述
    private Integer nice;//被点赞数
    private Integer fans;//被关注数
    private Integer nickname;//昵称
    private Integer photo;//对应头像表id
    private Integer live;//激活状态
    private Date createdate;//创建时间
    private Date deldate;//拉黑时间
    private Integer livenum;//活跃度预留属性
}
