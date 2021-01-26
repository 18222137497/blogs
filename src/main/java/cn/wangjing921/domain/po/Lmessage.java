package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 消息表
 */
@Data
public class Lmessage {
    private Integer lmid;
    private Integer toluid;//发给谁
    private Integer fromluid;//从那个人发
    private String lmsg;//发了什么内容
    private Date senddate;//发送时间
}
