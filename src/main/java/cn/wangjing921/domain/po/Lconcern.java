package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 关注表
 * @author afflatus
 */
@Data
public class Lconcern implements Serializable {
    /**
     * 主键
     */
    private Integer lconcernid;

    /**
     * 被关注
     */
    private Integer touid;

    /**
     * 关注方
     */
    private Integer fromuid;

    /**
     * 关注时间
     */
    private Date concerndate;

    private static final long serialVersionUID = 1L;
}