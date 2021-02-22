package cn.wangjing921.custenum.baseEnum;

import cn.wangjing921.exception.TransitionException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.util.HashMap;

/**
 * 枚举类型数据返回前端的处理
 * 库->程序
 * @author afflatus
 */
@Slf4j
public class JsonEnumSerializer extends JsonSerializer<IBaseEnumInterface> {

    @Override
    public void serialize(IBaseEnumInterface iBaseEnum, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
        HashMap<String, Object> map = new HashMap<>();
        map.put("value",iBaseEnum.value());
        map.put("title",iBaseEnum.title());
        try {
            serializerProvider.defaultSerializeValue(map,jsonGenerator);
        } catch (IOException e) {
            log.error("枚举序列化异常",e);
            throw new TransitionException();
        }

    }
}
