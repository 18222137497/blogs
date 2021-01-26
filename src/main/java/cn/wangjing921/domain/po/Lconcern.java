package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 关注表
 */
@Data
public class Lconcern {
    private Integer lconcernid;
    private Integer touid;//被关注id
    private Integer fromuid;//关注人id
    private Date concerndate;//关注时间
}
