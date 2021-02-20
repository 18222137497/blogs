package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Luser;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * 博客用户表
 * @author afflatus
 */
@Repository
public interface LuserMapper {
    int deleteByPrimaryKey(Integer luserid);

    int insert(Luser record);

    int insertSelective(Luser record);

    Luser selectByPrimaryKey(Integer luserid);

    int updateByPrimaryKeySelective(Luser record);

    int updateByPrimaryKey(Luser record);
}