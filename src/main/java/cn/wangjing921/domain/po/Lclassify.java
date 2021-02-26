package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 博客分类表
 * @author afflatus
 */
@Data
public class Lclassify implements Serializable {

    private static final long serialVersionUID = 2238936111698431482L;
    /**
     * 分类id
     */
    private Integer lclassifyid;

    /**
     * 分类标题
     */
    private String lclassifytitle;

}