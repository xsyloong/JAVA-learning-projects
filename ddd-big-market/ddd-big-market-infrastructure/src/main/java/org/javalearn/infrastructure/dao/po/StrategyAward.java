package org.javalearn.infrastructure.dao.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @Created suyunlong
 * @Description StrategyAward实体类
 * @Date 2025/3/9 20:13
 * @Email loongloongking@gmail.com
 */
@Data
@Accessors( chain = true )
public class StrategyAward {
    /**
     *自增ID
     */
    private Long id;
    /**
     *抽奖策略ID
     */
    private Long strategyId;
    /**
     *抽奖奖品ID内部流转使用
     */
    private Long awardId;
    /**
     *抽奖奖品标题
     */
    private String awardTitle;
    /**
     *抽奖奖品副标题
     */
    private String awardSubtitle;
    /**
     *奖品库存总量
     */
    private Integer awardCount;
    /**
     *奖品库存剩余
     */
    private Integer awardCountSurplus;
    /**
     *奖品中奖概率
     */
    private BigDecimal awardRate;
    /**
     *规则模型，rule配置的模型同步到此表，便于使用
     */
    private String ruleModels;
    /**
     *排序
     */
    private Integer sort;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *修改时间
     */
    private Date updateTime;
}
