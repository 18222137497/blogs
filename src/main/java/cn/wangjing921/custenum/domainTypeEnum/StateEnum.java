package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;

/**
 * 用户激活状态
 * @author afflatus
 */
public enum StateEnum implements IBaseEnumInterface<Integer> {
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
    public static String wonTitle(Integer value) {
        for (StateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
