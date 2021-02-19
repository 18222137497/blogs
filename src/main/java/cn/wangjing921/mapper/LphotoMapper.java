package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lphoto;

/**
 * 头像表
 * @author afflatus
 */
public interface LphotoMapper {
    int deleteByPrimaryKey(Integer lpid);

    int insert(Lphoto record);

    int insertSelective(Lphoto record);

    Lphoto selectByPrimaryKey(Integer lpid);

    int updateByPrimaryKeySelective(Lphoto record);

    int updateByPrimaryKey(Lphoto record);
}