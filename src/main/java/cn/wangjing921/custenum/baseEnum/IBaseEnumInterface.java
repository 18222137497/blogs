package cn.wangjing921.custenum.baseEnum;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;

/**
 * 枚举序列化接口
 * @param <T> 枚举的value类型
 * @author afflatus
 */
@JsonSerialize(using = JsonSerializer.class)//json序列化
public interface IBaseEnumInterface<T> extends Serializable {
    T value();
    String title();

}
