package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lconcern;

/**
 * 关注表
 * @author afflatus
 */
public interface LconcernMapper {
    int deleteByPrimaryKey(Integer lconcernid);

    int insert(Lconcern record);

    int insertSelective(Lconcern record);

    Lconcern selectByPrimaryKey(Integer lconcernid);

    int updateByPrimaryKeySelective(Lconcern record);

    int updateByPrimaryKey(Lconcern record);
}