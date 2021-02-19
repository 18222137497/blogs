package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 消息表
 * @author afflatus
 */
@Data
public class Lmessage implements Serializable {
    /**
     * 主键

     */
    private Integer lmid;

    /**
     * 发给那个id的用户，默认为系统
     */
    private Integer toluid;

    /**
     * 谁发的，默认系统
     */
    private Integer fromluid;

    /**
     * 消息体
     */
    private String lmsg;

    /**
     * 发送的时间
     */
    private Date senddate;

    private static final long serialVersionUID = 1L;
}