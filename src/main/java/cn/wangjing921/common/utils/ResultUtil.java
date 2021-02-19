package cn.wangjing921.common.utils;

import cn.wangjing921.domain.pojo.Result;

/**
 * 返回统一格式封装工具
 * @author afflatus
 */
public class ResultUtil {
    /**
     * 成功设置msg
     *
     * @param msg
     * @return
     */
    public static Result success(String msg) {
        return success(200, msg);
    }

    /**
     * 成功设置code和msg
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result success(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    /**
     * 成功外加数据
     *
     * @param code
     * @param object
     * @param msg
     * @return
     */
    public static Result success(Integer code, Object object, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setData(object);
        result.setMsg(msg);
        return result;
    }

    /**
     * 失败设置code，msg
     *
     * @param code
     * @param msg
     * @return
     */
    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
