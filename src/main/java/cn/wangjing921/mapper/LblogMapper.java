package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lblog;
import org.springframework.stereotype.Repository;

/**
 * 博客表
 * @author afflatus
 */
@Repository
public interface LblogMapper {
    int deleteByPrimaryKey(Integer lblogid);

    int insert(Lblog record);

    int insertSelective(Lblog record);

    Lblog selectByPrimaryKey(Integer lblogid);

    int updateByPrimaryKeySelective(Lblog record);

    int updateByPrimaryKey(Lblog record);
}