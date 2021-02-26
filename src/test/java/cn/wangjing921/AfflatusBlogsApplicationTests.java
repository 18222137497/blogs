package cn.wangjing921;
import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;
import cn.wangjing921.custenum.domainTypeEnum.ReportStateEnum;
import cn.wangjing921.custenum.domainTypeEnum.BlogRemarkEnum;
import cn.wangjing921.custenum.domainTypeEnum.BlogStateEnum;
import cn.wangjing921.custenum.domainTypeEnum.LVEnum;

import cn.wangjing921.custenum.domainTypeEnum.UserStateEnum;
import cn.wangjing921.domain.po.Lblog;
import cn.wangjing921.domain.po.Lblogtype;
import cn.wangjing921.domain.po.Lreport;
import cn.wangjing921.domain.po.Luser;
import cn.wangjing921.mapper.LblogMapper;
import cn.wangjing921.mapper.LreportMapper;
import cn.wangjing921.mapper.LuserMapper;
import cn.wangjing921.service.LuserService;
import com.alibaba.druid.support.json.JSONUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.HttpStatus;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Date;

@SpringBootTest
class AfflatusBlogsApplicationTests {
    @Autowired
    LuserMapper mapper;
    @Autowired
    RedisTemplate<String,Object> redisTemplate;
    @Autowired
    LuserService luserService;

    @Test
    void contextLoads() { //查
//        Luser luser = new Luser();
//        luser.setUsername("wangjing921");
//        luser.setPassword("123456");
//        luser.setPhone("18222137493");
//        luser.setBlognum(0);
//        luser.setLook(0);
//        luser.setLabel("");
//        luser.setNice(0);
//        luser.setFans(0);
//        luser.setNickname("");
//        luser.setPhoto("");
//        luser.setLive(UserStateEnum.UNACTIVATED);
//        luser.setCreatedate(new Date());
//        luser.setDeldate(new Date());
//        luser.setLivenum(0);
//        luser.setLV(LVEnum.ORDINARY);
//
//        luserService.registerLuser(luser);
        Lreport lreport = new Lreport();
        lreport.setLreportid(0);
        lreport.setLreportmsg("");
        lreport.setToblogid(0);
        lreport.setFromuid(0);
        lreport.setSendtime(new Date());
        lreport.setLreporttype(0);
        lreport.setState(ReportStateEnum.NO);
        lreport.setReturnMsg("");
        Lblogtype lblogtype = new Lblogtype();
//
//        String o = JSON.toJSONString(lreport);
//        JSON.parseObject(o);
//        //Type装所有需要json转object的类型数组
//        Type[] types=new Type[]{};
//        JSON.parseArray(o, types);

//
//        System.out.println(report1);


//        String s1 = JSONUtils.toJSONString(LVEnum.ADMIN);
//        System.out.println(s1);

//        ObjectMapper mapper=new ObjectMapper();
//        String s =null;
//        try {
//             s=mapper.writeValueAsString(lreport);
//        } catch (JsonProcessingException e) {
//            e.printStackTrace();
//        }
//        System.out.println(s);

//        ValueOperations<String, Object> stringObjectValueOperations = redisTemplate.opsForValue();
//
//        stringObjectValueOperations.set("1",lreport );
//
//        Lreport o =(Lreport) stringObjectValueOperations.get("1");
//        System.out.println(o);


        System.out.println(mapper.selectByUsername("测试人物0"));
        System.out.println("启动成功");
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
