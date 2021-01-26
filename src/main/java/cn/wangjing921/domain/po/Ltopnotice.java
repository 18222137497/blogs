package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 首页轮播图
 */
@Data
public class Ltopnotice {
    private Integer ltopnoticeid;
    private String ltopnoticeimg;//图片路径
    private String ltopnoticetitle;//标题
    private String ltopnoticedata;//内容
    private Date sendtime;//发送时间
    private String ltopnoticeurl;//跳转url
}
