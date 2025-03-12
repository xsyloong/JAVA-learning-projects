package org.javalearn.domain.strategy.model.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

/**
 * @Created suyunlong
 * @Date 2025/3/12 22:42
 * @Email loongloongking@gmail.com
 */
@Data
@Accessors(chain = true)
public class StrategyAwardEntity {
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

}
