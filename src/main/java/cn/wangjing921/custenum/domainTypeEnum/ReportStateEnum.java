package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 举报受理状态
 * @author afflatus
 */
@JsonDeserialize
@JsonSerialize
public enum ReportStateEnum implements IBaseEnumInterface<Integer> {

    NO(0,"未受理"),
    Yes(1,"已受理");

    private final Integer value;

    private final String title;

    private ReportStateEnum(Integer value, String title) {
        this.value = value;
        this.title = title;
    }
    @JsonValue
    public Integer getValue() {
        return value;
    }
@JsonView
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
        for (ReportStateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }

}
