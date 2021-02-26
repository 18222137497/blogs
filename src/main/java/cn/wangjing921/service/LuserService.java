package cn.wangjing921.service;

import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.domain.pojo.Result;
/**
 * 用户服务接口
 * @author afflatus
 */
public interface LuserService {
    /**
     * 登录
     * @param luser
     * @return
     */
    String registerLuser(Luser luser);
}
