package org.javalearn.infrastructure.adapter.repository;

import lombok.RequiredArgsConstructor;
import org.javalearn.domain.strategy.adapter.repository.StartegyAwardRepository;
import org.javalearn.domain.strategy.model.entity.StrategyAwardEntity;
import org.javalearn.infrastructure.adapter.mapper.StrategyAwardEntityConvetor;
import org.javalearn.infrastructure.dao.StrategyAwardDao;
import org.javalearn.infrastructure.dao.po.StrategyAward;
import org.javalearn.infrastructure.redis.RedisService;
import org.javalearn.types.common.Constants;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Created suyunlong 
 * @Date 2025/3/13 22:21
 * @Email loongloongking@gmail.com
 */
@Repository
@RequiredArgsConstructor
public class StrategyAwardRepositoryImpl implements StartegyAwardRepository {

    private final StrategyAwardDao strategyAwardDao;
    private final RedisService redisService;

    @Override
    public List<StrategyAwardEntity> queryListByStrategyId(Long strategyId) {
        String redisKey = Constants.RedisKey.STRATEGY_AWARD_LIST_KEY + Constants.CharacterSymbols.UNDERSCORE + strategyId;
        List<StrategyAwardEntity> awardList = redisService.getValue(redisKey);
        if(CollectionUtils.isEmpty(awardList)){
            List<StrategyAward> strategyAwards = strategyAwardDao.selectListByStrategyId(strategyId);
            awardList = StrategyAwardEntityConvetor.INSTANCE.toStrategyAwardEntityList(strategyAwards);
            redisService.setValue(redisKey,awardList);
        }
        return awardList;
    }
}
