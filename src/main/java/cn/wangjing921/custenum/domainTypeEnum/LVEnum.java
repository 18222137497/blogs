package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 账号描述,用户类型
 * @author afflatus
 */
@JsonDeserialize
@JsonSerialize
public enum LVEnum implements IBaseEnumInterface<Integer> {
    ORDINARY(0,"普通用户"),
    ADMIN(1,"管理员"),
    VIP(2,"VIP"),
    LOSER(3,"低信誉用户");

    private final Integer value;

    private final String title;

    private LVEnum(Integer value, String title) {
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
    public static String wonTitle(@JsonProperty("value")Integer value) {
        for (LVEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
