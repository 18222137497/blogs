package cn.wangjing921.domain.po;

import lombok.Data;

import java.util.Date;

/**
 * 举报名单
 */
@Data
public class Lreport {
    private Integer lreportid;
    private String lreportmsg;//举报原因
    private Integer toblogid;//被举报id
    private Integer fromuid;//谁发起的
    private Date sendtime;//发送时间
    private Integer lreporttype;//举报类型
}
