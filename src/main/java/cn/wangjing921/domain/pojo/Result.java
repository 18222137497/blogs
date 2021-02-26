package cn.wangjing921.domain.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * 响应体
 * @author afflatus
 */
@Data
public class Result<T> implements Serializable {

    private static final long serialVersionUID = 680563015863493408L;
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 信息
     */
    private String msg;
    /**
     * 数据
     */
    private T data;
}
