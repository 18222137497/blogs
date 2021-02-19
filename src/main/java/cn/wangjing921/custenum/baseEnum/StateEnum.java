package cn.wangjing921.custenum.baseEnum;

import cn.wangjing921.common.annotation.Convertible;

/**
 * 用户激活状态
 * @author afflatus
 */
@Convertible
public enum StateEnum {
    UNACTIVATED(0,"未激活"),
    LIVE(1,"正常"),
    DIE(2,"黑名单");

    private final Integer value;

    private final String title;

    private StateEnum(Integer value, String title) {
        this.value = value;
        this.title = title;
    }

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

    public Integer value() {
        return value;
    }

    public static String title(Integer value) {
        for (StateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
