package org.javalearn.test.domain.strategy;

import org.javalearn.domain.strategy.service.armory.StrategyArmory;
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
public class StrategyArmoryTest {

    @Resource
    private StrategyArmory strategyArmory;
    @Resource
    private RedisService redisService;

    @Test
    public void testAssembleStrategy(){
        strategyArmory.assembleStrategyAwardList(100001L);
        Assert.assertEquals(10000, ((Integer) redisService.getValue(Constants.RedisKey.STRATEGY_RATE_RANGE_KEY + 100001L)).longValue());
    }
}
