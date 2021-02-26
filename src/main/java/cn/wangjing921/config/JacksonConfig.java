package cn.wangjing921.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;
/**
 * jackson配置类
 * @author afflatus
 */
@Configuration
public class JacksonConfig {
    @Bean
    public ObjectMapper serializingObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();

        // 设置时区
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));//就是UTC
        // 设置时间格式
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

        JavaTimeModule javaTimeModule = new JavaTimeModule();
        /** 序列化配置,针对java8 时间 **/
        javaTimeModule.addSerializer(LocalDateTime.class, new LocalDateTimeSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        javaTimeModule.addSerializer(LocalDate.class, new LocalDateSerializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        javaTimeModule.addSerializer(LocalTime.class, new LocalTimeSerializer(DateTimeFormatter.ofPattern("HH:mm:ss")));

        /** 反序列化配置,针对java8 时间 **/
        javaTimeModule.addDeserializer(LocalDateTime.class, new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
        javaTimeModule.addDeserializer(LocalDate.class, new LocalDateDeserializer(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        javaTimeModule.addDeserializer(LocalTime.class, new LocalTimeDeserializer(DateTimeFormatter.ofPattern("HH:mm:ss")));

        /** 声明自定义模块,配置double类型序列化配置 **/
        SimpleModule module = new SimpleModule("DoubleSerializer", new Version(1, 0, 0, ""));
        // 注意Double和double需要分配配置
        module.addSerializer(Double.class,new DoubleSerializer());
        module.addSerializer(double.class,new DoubleSerializer());

        /** 注册模块 **/
        objectMapper
                .registerModule(javaTimeModule)
                .registerModule(module)
                .registerModule(new Jdk8Module())
                .registerModule(new ParameterNamesModule());
        return objectMapper;
    }

    /**
     * double类型序列化
     */
    public class DoubleSerializer extends JsonSerializer<Double> {

        @Override
        public void serialize(Double value, JsonGenerator gen, SerializerProvider serializers)
                throws IOException {
            BigDecimal d = new BigDecimal(value.toString());
            gen.writeNumber(d.stripTrailingZeros().toPlainString());
        }

        @Override
        public Class<Double> handledType() {
            return Double.class;
        }
    }


}
