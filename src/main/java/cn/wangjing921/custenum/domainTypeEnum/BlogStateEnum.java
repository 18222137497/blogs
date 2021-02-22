package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;

/**
 * 博客过审状态
 * @author afflatus
 */
public enum BlogStateEnum implements IBaseEnumInterface<Integer> {

    WAIT(0,"待审核"),
    YES(1,"审核通过"),
    NO(2,"未过审");

    private final Integer value;

    private final String title;

    private BlogStateEnum(Integer value, String title) {
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
        for (BlogStateEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
