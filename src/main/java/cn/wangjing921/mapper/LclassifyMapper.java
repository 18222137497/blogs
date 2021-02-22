package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lclassify;
import org.springframework.stereotype.Repository;

/**
 * 分类表
 * @author afflatus
 */
@Repository
public interface LclassifyMapper {
    int deleteByPrimaryKey(Integer lclassifyid);

    int insert(Lclassify record);

    int insertSelective(Lclassify record);

    Lclassify selectByPrimaryKey(Integer lclassifyid);

    int updateByPrimaryKeySelective(Lclassify record);

    int updateByPrimaryKey(Lclassify record);
}