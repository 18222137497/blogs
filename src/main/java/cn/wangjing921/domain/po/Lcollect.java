package cn.wangjing921.domain.po;

import lombok.Data;

/**
 * 收藏表
 */
@Data
public class Lcollect {
    private Integer lcid;
    private Integer luid;//用户
    private Integer lbid;//博客
}
