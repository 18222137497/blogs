package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lblogtype;

/**
 * 博客是不是精品什么的
 * @author afflatus
 */
public interface LblogtypeMapper {
    int deleteByPrimaryKey(Integer lblogtypeid);

    int insert(Lblogtype record);

    int insertSelective(Lblogtype record);

    Lblogtype selectByPrimaryKey(Integer lblogtypeid);

    int updateByPrimaryKeySelective(Lblogtype record);

    int updateByPrimaryKey(Lblogtype record);
}