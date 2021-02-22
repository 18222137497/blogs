package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lconcern;
import org.springframework.stereotype.Repository;

/**
 * 关注表
 * @author afflatus
 */
@Repository
public interface LconcernMapper {
    int deleteByPrimaryKey(Integer lconcernid);

    int insert(Lconcern record);

    int insertSelective(Lconcern record);

    Lconcern selectByPrimaryKey(Integer lconcernid);

    int updateByPrimaryKeySelective(Lconcern record);

    int updateByPrimaryKey(Lconcern record);
}