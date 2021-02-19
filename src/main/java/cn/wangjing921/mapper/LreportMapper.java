package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lreport;

/**
 * 举报清单
 * @author afflatus
 */
public interface LreportMapper {
    int deleteByPrimaryKey(Integer lreportid);

    int insert(Lreport record);

    int insertSelective(Lreport record);

    Lreport selectByPrimaryKey(Integer lreportid);

    int updateByPrimaryKeySelective(Lreport record);

    int updateByPrimaryKey(Lreport record);
}