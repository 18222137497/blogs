package cn.wangjing921.custenum.baseEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 方法执行结果
 * @author afflatus
 */
@JsonDeserialize
@JsonSerialize
public enum MethodActiveStateEnum implements IBaseEnumInterface<Integer>{

    SUCCEED(1,"成功"),

    DEFEAT(0,"失败");

    private final Integer value;

    private final String title;

    private MethodActiveStateEnum(Integer value, String title) {
        this.value = value;
        this.title = title;
    }
    @JsonValue
    public Integer getValue() {
        return value;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title;
    }
    @Override
    public Integer value() {
        return value;
    }

    @Override
    public String title() {
        return title;
    }

    /**
     * 通过value获取title
     * @param value
     * @return
     */
    @JsonCreator
    public static String wonTitle(Integer value) {
        for (MethodActiveStateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }

}
