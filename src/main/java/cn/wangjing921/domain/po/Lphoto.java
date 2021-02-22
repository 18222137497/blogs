package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 头像表
 * 遍历头像列表，点击-》id-》修改用户表url
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