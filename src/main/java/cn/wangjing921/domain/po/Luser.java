package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;

import cn.wangjing921.custenum.domainTypeEnum.LVEnum;
import cn.wangjing921.custenum.domainTypeEnum.UserStateEnum;
import lombok.Data;

/**
 * 用户表
 * @author afflatus
 */
@Data
public class Luser implements Serializable {
    private static final long serialVersionUID = 5903901908871919096L;
    /**
     * 主键不展示
     */
    private Integer luserid;

    /**
     * 用户登录用
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 发布博客数
     */
    private Integer blognum;

    /**
     * 被访问量(考虑一人只能造成一次单向访问)
     */
    private Integer look;

    /**
     * 账号描述
     */
    private String label;

    /**
     * 获赞数
     */
    private Integer nice;

    /**
     * 被关注数
     */
    private Integer fans;

    /**
     * 昵称
     */
    private String nickname;

    /**
     * 头像(有默认值，需要新增头像修改功能)
     */
    private String photo;

    /**
     * 激活/开启状态(0未激活1正常2禁用)
     */
    private UserStateEnum live;

    /**
     * 创建时间
     */
    private Date createdate;

    /**
     * 最后一次登录时间
     */
    private Date deldate;

    /**
     * 预留属性，活跃度
     */
    private Integer livenum;

    /**
     * 用户类型
     */
    private LVEnum LV;

}