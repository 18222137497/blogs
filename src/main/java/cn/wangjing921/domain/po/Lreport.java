package cn.wangjing921.domain.po;

import java.io.Serializable;
import java.util.Date;

import cn.wangjing921.custenum.domainTypeEnum.ReportStateEnum;
import lombok.Data;

/**
 * 举报清单
 * @author afflatus
 */
@Data
public class Lreport implements Serializable {
    /**
     * 主键
     */
    private Integer lreportid;

    /**
     * 举报原因
     */
    private String lreportmsg;

    /**
     * 被举报id（博客/评论都可以）
     */
    private Integer toblogid;

    /**
     * 谁举报的
     */
    private Integer fromuid;

    /**
     * 举报时间
     */
    private Date sendtime;

    /**
     * 举报类型0博客，1评论
     */
    private Integer lreporttype;

    /**
     * 受理状态
     */
    private ReportStateEnum state;

    /**
     * 处理完的消息
     */
    private String returnMsg;

    private static final long serialVersionUID = 1L;
}