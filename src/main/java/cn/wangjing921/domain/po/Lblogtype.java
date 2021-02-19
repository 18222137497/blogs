package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 博客是不是精品什么的
 * @author afflatus
 */
@Data
public class Lblogtype implements Serializable {
    /**
     * 主键，对应类型编号
     */
    private Integer lblogtypeid;

    /**
     * 备注文字说明
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}