package cn.wangjing921.exception;

import cn.wangjing921.exception.baseException.BaseException;

/**
 * 类型转换异常
 */
public class TransitionException extends BaseException {

    private static final String code="001";

    private static final String msg="类型转换异常";

    public TransitionException() {
        super(code, msg);
    }

}

