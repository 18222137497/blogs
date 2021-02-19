package cn.wangjing921.common.utils;

import org.springframework.util.DigestUtils;


/**
 * MD5加密工具
 * @author afflatus
 */
public class MD5Util {
    public String encoding(String code) {
        //spring md5加密
        byte[] md5bytes = DigestUtils.md5Digest(code.getBytes());
        //装载
        StringBuffer hexValue = new StringBuffer();
        for (byte md5Byte : md5bytes) {
            int val = ((int) md5Byte) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        //转类型返回
        return hexValue.toString();
    }

}
