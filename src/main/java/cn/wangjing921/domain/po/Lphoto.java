package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 头像表
 * @author afflatus
 */
@Data
public class Lphoto implements Serializable {
    private Integer lpid;

    /**
     * 头像url
     */
    private String lpurl;

    private static final long serialVersionUID = 1L;
}