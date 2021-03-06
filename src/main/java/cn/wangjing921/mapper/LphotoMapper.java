package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lphoto;
import org.springframework.stereotype.Repository;

/**
 * 头像表
 * @author afflatus
 */
@Repository
public interface LphotoMapper {
    int deleteByPrimaryKey(Integer lpid);

    int insert(Lphoto record);

    int insertSelective(Lphoto record);

    Lphoto selectByPrimaryKey(Integer lpid);

    int updateByPrimaryKeySelective(Lphoto record);

    int updateByPrimaryKey(Lphoto record);
}