package cn.wangjing921;
import cn.wangjing921.custenum.domainTypeEnum.BlogRemarkEnum;
import cn.wangjing921.custenum.domainTypeEnum.BlogStateEnum;
import cn.wangjing921.custenum.domainTypeEnum.LVEnum;

import cn.wangjing921.custenum.domainTypeEnum.UserStateEnum;
import cn.wangjing921.domain.po.Lblog;
import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.mapper.LblogMapper;
import cn.wangjing921.mapper.LreportMapper;
import cn.wangjing921.mapper.LuserMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class AfflatusBlogsApplicationTests {
    @Autowired
    LreportMapper mapper;

    @Test
    void contextLoads() { //查
        System.out.println(mapper.selectByPrimaryKey(1));
    }
//    @Test
//    void contextLoads0() { //删
//        mapper.deleteByPrimaryKey(1);
//    }
//    @Test
//    void contextLoads1() { //插
//        Lblog lblog = new Lblog();
//        lblog.setTitle("测试1");
//        lblog.setLbloguid(0);
//        lblog.setLblognice(0);
//        lblog.setLbogcomment(0);
//        lblog.setBlogurl("");
//        lblog.setLbloglook(0);
//        lblog.setSendtime(new Date());
//        lblog.setLive(BlogStateEnum.WAIT);
//        lblog.setClassifyid(0);
//        lblog.setRemark(BlogRemarkEnum.STAR);
//
//        mapper.insertSelective(lblog);
//    }
//
//    @Test
//    void contextLoads2() { //改
//        Lblog lblog = new Lblog();
//        lblog.setTitle("测试1");
//        lblog.setLbloguid(0);
//        lblog.setLblognice(0);
//        lblog.setLbogcomment(0);
//        lblog.setBlogurl("");
//        lblog.setLbloglook(0);
//        lblog.setSendtime(new Date());
//        lblog.setLive(BlogStateEnum.WAIT);
//        lblog.setClassifyid(0);
//        lblog.setRemark(BlogRemarkEnum.STAR);
//
//        mapper.updateByPrimaryKeySelective(lblog);
//    }
//

}
