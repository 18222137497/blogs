package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Ltopnotice;

/**
 * 首页公告轮播图
 * @author afflatus
 */
public interface LtopnoticeMapper {
    int deleteByPrimaryKey(Integer ltopnoticeid);

    int insert(Ltopnotice record);

    int insertSelective(Ltopnotice record);

    Ltopnotice selectByPrimaryKey(Integer ltopnoticeid);

    int updateByPrimaryKeySelective(Ltopnotice record);

    int updateByPrimaryKey(Ltopnotice record);
}