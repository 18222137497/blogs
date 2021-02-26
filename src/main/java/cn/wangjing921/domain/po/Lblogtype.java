package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 博客是不是精品什么的  无用
 * @author afflatus
 */
@Data
@Deprecated
public class Lblogtype implements Serializable {

    private static final long serialVersionUID = 5250145557989283673L;
    /**
     * 主键，对应类型编号
     */
    private Integer lblogtypeid;

    /**
     * 备注文字说明
     */
    private String remark;

}