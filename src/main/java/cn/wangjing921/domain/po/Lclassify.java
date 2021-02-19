package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 分类表
 * @author afflatus
 */
@Data
public class Lclassify implements Serializable {
    /**
     * 分类id
     */
    private Integer lclassifyid;

    /**
     * 分类标题
     */
    private String lclassifytitle;

    private static final long serialVersionUID = 1L;
}