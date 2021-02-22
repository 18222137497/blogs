package cn.wangjing921.exception.baseException;

/**
 * 基类异常类型
 * @author afflatus
 */
public class BaseException extends RuntimeException{
    /**
     * 错误码
     */
    private String code;
    /**
     * 错误消息
     */
    private String msg;

    /**
     * 关联构造
     * @param code 错误码
     * @param msg 错误消息
     */
    public BaseException(String code,String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }


    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
