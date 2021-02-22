package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lcollect;
import org.springframework.stereotype.Repository;

/**
 * 收藏表
 * @author afflatus
 */
@Repository
public interface LcollectMapper {
    int deleteByPrimaryKey(Integer lcid);

    int insert(Lcollect record);

    int insertSelective(Lcollect record);

    Lcollect selectByPrimaryKey(Integer lcid);

    int updateByPrimaryKeySelective(Lcollect record);

    int updateByPrimaryKey(Lcollect record);
}