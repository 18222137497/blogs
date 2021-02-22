package cn.wangjing921.custenum.domainTypeEnum;

import cn.wangjing921.custenum.baseEnum.IBaseEnumInterface;

/**
 * 博客备注
 * @author afflatus
 */
public enum BlogRemarkEnum implements IBaseEnumInterface<Integer> {

    ORDINARY(0,""),//普通不显示
    STAR(1,"精品"),
    TOP(2,"置顶");



    private final Integer value;

    private final String title;

    private BlogRemarkEnum(Integer value, String title) {
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
        for (BlogRemarkEnum ot : values()) {
            if (ot.getValue().equals(value)) {
                return ot.getTitle();
            }
        }
        return null;
    }
}
