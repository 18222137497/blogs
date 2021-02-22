package cn.wangjing921.mapper;


import cn.wangjing921.domain.po.Lnotice;
import org.springframework.stereotype.Repository;

/**
 * 上传博客的注意事项
 * @author afflatus
 */
@Repository
public interface LnoticeMapper {
    int deleteByPrimaryKey(Integer lnoticeid);

    int insert(Lnotice record);

    int insertSelective(Lnotice record);

    Lnotice selectByPrimaryKey(Integer lnoticeid);

    int updateByPrimaryKeySelective(Lnotice record);

    int updateByPrimaryKey(Lnotice record);
}