package org.javalearn.infrastructure.dao.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Created suyunlong
 * @Description StrategyRule实体类
 * @Date 2025/3/9 20:18
 * @Email loongloongking@gmail.com
 */
@Data
@Accessors(chain = true)
public class StrategyRule {
    /**
     *自增ID
     */
    private Long id;
    /**
     *抽奖策略ID
     */
    private Long strategyId;
    /**
     *抽奖奖品ID【规则类型为策略，则不需要奖品ID】
     */
    private Long awardId;
    /**
     *抽象规则类型；1-策略规则、2-奖品规则
     */
    private Integer ruleType;
    /**
     *抽奖规则类型【rule_random - 随机值计算、rule_lock - 抽奖几次后解锁、rule_luck_award - 幸运奖(兜底奖品)】
     */
    private String ruleModel;
    /**
     *抽奖规则比值
     */
    private String ruleValue;
    /**
     *抽奖规则描述
     */
    private String ruleDesc;
    /**
     *创建时间
     */
    private Date createTime;
    /**
     *更新时间
     */
    private Date updateTime;
}
