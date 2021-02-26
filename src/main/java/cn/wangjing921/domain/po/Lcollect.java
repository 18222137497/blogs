package cn.wangjing921.domain.po;

import java.io.Serializable;
import lombok.Data;

/**
 * 收藏表
 * @author afflatus
 */
@Data
public class Lcollect implements Serializable {
    private static final long serialVersionUID = 5590460078701997805L;
    /**
     * 收藏表主键，没有实际意义，特定条件下能提高查询效率
     */
    private Integer lcid;

    /**
     * 用户id
     */
    private Integer luid;

    /**
     * 博客id
     */
    private Integer lbid;

}