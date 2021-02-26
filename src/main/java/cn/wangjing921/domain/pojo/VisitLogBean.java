package cn.wangjing921.domain.pojo;

import cn.wangjing921.custenum.baseEnum.MethodActiveStateEnum;
import lombok.Data;

import java.io.Serializable;

/**
 * 访问日志实体类
 * @author afflatus
 */
@Data
public class VisitLogBean implements Serializable {

    private static final long serialVersionUID = -5667380790362978808L;
    /**
     * IP地址
     */
    private String IP;
    /**
     * 用户名
     */
    private String username;
    /**
     * 方法名称
     */
    private String method;
    /**
     * 是否执行成功
     */
    private MethodActiveStateEnum state;
    /**
     * 执行结果消息
     */
    private String msg;

}
