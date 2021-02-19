package cn.wangjing921;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.wangjing921.mapper")
public class AfflatusBlogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AfflatusBlogsApplication.class, args);
    }

}
