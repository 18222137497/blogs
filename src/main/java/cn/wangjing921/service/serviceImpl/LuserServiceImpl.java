package cn.wangjing921.service.serviceImpl;

import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.mapper.LuserMapper;
import cn.wangjing921.service.LuserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 用户服务实现类
 * @author afflatus
 */
@Service
@Slf4j
@Transactional(rollbackFor=Exception.class)
public class LuserServiceImpl implements LuserService {
    @Autowired
    LuserMapper luserMapper;
    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder;
    @Override
    public String registerLuser(Luser luser) {
        log.info("执行账号注册------加密密码");
        luser.setPassword(bCryptPasswordEncoder.encode(luser.getPassword()));
        try {
            log.info("执行账号注册------插入数据库");
            luserMapper.insertSelective(luser);
            log.info("执行账号注册------完成");
            return "成功+msg";
        } catch (Exception e) {
            log.error("执行账号注册------插入失败",e);
        }
        return "失败+msg";
    }
}
