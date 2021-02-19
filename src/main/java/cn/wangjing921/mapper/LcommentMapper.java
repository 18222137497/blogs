package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lcomment;

/**
 * 评论表
 * @author afflatus
 */
public interface LcommentMapper {
    int deleteByPrimaryKey(Integer lcoid);

    int insert(Lcomment record);

    int insertSelective(Lcomment record);

    Lcomment selectByPrimaryKey(Integer lcoid);

    int updateByPrimaryKeySelective(Lcomment record);

    int updateByPrimaryKey(Lcomment record);
}