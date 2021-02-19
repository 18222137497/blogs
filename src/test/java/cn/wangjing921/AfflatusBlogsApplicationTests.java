package cn.wangjing921;

import cn.wangjing921.domain.po.Lblog;
import cn.wangjing921.mapper.LblogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class AfflatusBlogsApplicationTests {
    @Autowired
    LblogMapper lblogMapper;
    @Test
    void contextLoads() {

    }

}
