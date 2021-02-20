package cn.wangjing921.custenum.baseEnum;

import cn.wangjing921.custenum.domainTypeEnum.StateEnum;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedTypes;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@MappedTypes(value = {StateEnum.class})//没有参数也行。。。。。。原本要填对应的枚举数组的
public class IBaseEnumHandler<T extends IBaseEnumInterface> extends BaseTypeHandler<T> {
    private Class<T> type;
    private T[] enums;

    /**
     * 调用时需创建实例
     * @param type 对应枚举的class
     */
    public IBaseEnumHandler(Class<T> type) {
        if (type == null) {
            throw new IllegalArgumentException("类型参数不能为空");
        }
        this.type = type;
        this.enums = type.getEnumConstants();

    }
    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, T t, JdbcType jdbcType) throws SQLException {
        if (jdbcType == null) {
            preparedStatement.setString(i, t.value().toString());
        } else {
            preparedStatement.setObject(i, t.value(), jdbcType.TYPE_CODE);
        }
    }

    @Override
    public T getNullableResult(ResultSet resultSet, String s) throws SQLException {
        return getEnumByValue(resultSet.getObject(s));
    }
    //获取对应value的枚举
    private T getEnumByValue(Object object) {
        if (object == null) {
            return null;
        }
        for (T t : enums) {
            if (t.value().equals(object) || t.value().toString().equals(object.toString())) {
                return t;
            }
        }
        return null;
    }

    @Override
    public T getNullableResult(ResultSet resultSet, int i) throws SQLException {
        return getEnumByValue(resultSet.getObject(i));
    }

    @Override
    public T getNullableResult(CallableStatement callableStatement, int i) throws SQLException {
        return getEnumByValue(callableStatement.getObject(i));
    }
    public Class<T> getType() {
        return type;
    }

    public void setType(Class<T> type) {
        this.type = type;
    }

    public T[] getEnums() {
        return enums;
    }

    public void setEnums(T[] enums) {
        this.enums = enums;
    }
}
