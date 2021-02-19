package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Luser;

/**
 * 博客用户表
 * @author afflatus
 */
public interface LuserMapper {
    int deleteByPrimaryKey(Integer luserid);

    int insert(Luser record);

    int insertSelective(Luser record);

    Luser selectByPrimaryKey(Integer luserid);

    int updateByPrimaryKeySelective(Luser record);

    int updateByPrimaryKey(Luser record);
}