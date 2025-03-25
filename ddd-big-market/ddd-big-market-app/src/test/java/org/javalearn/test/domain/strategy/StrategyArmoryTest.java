package org.javalearn.test.domain.strategy;

import lombok.extern.slf4j.Slf4j;
import org.javalearn.domain.strategy.service.armory.StrategyArmory;
import org.javalearn.domain.strategy.service.armory.StrategyDispatch;
import org.javalearn.infrastructure.redis.RedisService;
import org.javalearn.types.common.Constants;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Created suyunlong
 * @Date 2025/3/23 19:40
 * @Email loongloongking@gmail.com
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class StrategyArmoryTest {
    
    private static final Long STRATEGY_ID_100001_FOR_TEST = 100001L;
    private static final Long STRATEGY_ID_100002_FOR_TEST = 100002L;

    @Resource
    private StrategyDispatch strategyDispatch;
    @Resource
    private StrategyArmory strategyArmory;
    @Resource
    private RedisService redisService;

    @Test
    public void testAssembleStrategy(){
        strategyDispatch.assembleStrategyAwardList(STRATEGY_ID_100001_FOR_TEST);
        Assert.assertEquals(10000, ((Integer) redisService.getValue(Constants.RedisKey.STRATEGY_RATE_RANGE_KEY + STRATEGY_ID_100001_FOR_TEST)).longValue());
        log.info("stratgy rate range is {}",((Integer)redisService.getValue(Constants.RedisKey.STRATEGY_RATE_RANGE_KEY + STRATEGY_ID_100001_FOR_TEST)));
        Assert.assertEquals(10000,redisService.getMap(Constants.RedisKey.STRATEGY_RATE_TABLE_KEY + STRATEGY_ID_100001_FOR_TEST).size());
        log.info("Strategy award map size is {}",redisService.getMap(Constants.RedisKey.STRATEGY_RATE_TABLE_KEY + STRATEGY_ID_100001_FOR_TEST).size());
    }
    
    @Test
    public void testGainRandomAward(){
        Long randomAwardIdByStrategyId = strategyArmory.getRandomAwardIdByStrategyId(STRATEGY_ID_100001_FOR_TEST);
        log.info("get random award is {}",randomAwardIdByStrategyId);
        Assert.assertNotNull(randomAwardIdByStrategyId);
    }
}
