package cn.wangjing921;
import cn.wangjing921.custenum.domainTypeEnum.StateEnum;

import cn.wangjing921.domain.po.Lblog;
import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.mapper.LblogMapper;
import cn.wangjing921.mapper.LuserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class AfflatusBlogsApplicationTests {
    @Autowired
    LuserMapper luserMapper;
    @Test
    void contextLoads() {
        Luser luser = new Luser();
        luser.setLuserid(1);
        luser.setUsername("测试人物0");
        luserMapper.updateByPrimaryKeySelective(luser);
    }

}
