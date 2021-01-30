package cn.wangjing921.domain.model;

import lombok.Data;

/**
 * 响应体
 */
@Data
public class Result<T> {
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
