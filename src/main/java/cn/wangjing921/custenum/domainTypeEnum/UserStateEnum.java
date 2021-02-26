package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 用户激活状态
 * @author afflatus
 */
@JsonDeserialize
@JsonSerialize
public enum UserStateEnum implements IBaseEnumInterface<Integer> {
    UNACTIVATED(0,"未激活"),
    LIVE(1,"正常"),
    DIE(2,"黑名单");

    private final Integer value;

    private final String title;

    private UserStateEnum(Integer value, String title) {
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
        for (UserStateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
