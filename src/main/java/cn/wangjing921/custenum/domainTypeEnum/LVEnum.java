package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;

/**
 * 账号描述,用户类型
 * @author afflatus
 */
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
        for (LVEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
