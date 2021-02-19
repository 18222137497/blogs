package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 上传博客的注意事项
 * @author afflatus
 */
@Data
public class Lnotice implements Serializable {
    /**
     * 主键
     */
    private Integer lnoticeid;

    /**
     * 内容
     */
    private String lnoticemsg;

    private static final long serialVersionUID = 1L;
}