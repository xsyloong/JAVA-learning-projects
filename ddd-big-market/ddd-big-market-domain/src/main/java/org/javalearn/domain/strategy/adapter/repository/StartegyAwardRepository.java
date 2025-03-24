package org.javalearn.domain.strategy.adapter.repository;

import org.javalearn.domain.strategy.model.entity.StrategyAwardEntity;

import java.util.List;
import java.util.Map;

/**
 * @Created suyunlong 
 * @Date 2025/3/13 22:20
 * @Email loongloongking@gmail.com
 */
public interface StartegyAwardRepository {

    List<StrategyAwardEntity> queryListByStrategyId(Long strategyId);

    void cacheAwardSearchRateMap(Long strategyId, Integer strategySearchRateRange, Map<Integer, Long> awardSearchRateMap);

    Long getAwardIdByAwardIdx(Long strategyId, Integer awardIdx);

    Integer getRateRangeByStrategyId(Long strategyId);
}
