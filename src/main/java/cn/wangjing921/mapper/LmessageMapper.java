package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lmessage;
import org.springframework.stereotype.Repository;

/**
 * 消息表
 * @author afflatus
 */
@Repository
public interface LmessageMapper {
    int deleteByPrimaryKey(Integer lmid);

    int insert(Lmessage record);

    int insertSelective(Lmessage record);

    Lmessage selectByPrimaryKey(Integer lmid);

    int updateByPrimaryKeySelective(Lmessage record);

    int updateByPrimaryKey(Lmessage record);
}