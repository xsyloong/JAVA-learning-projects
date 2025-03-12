package org.javalearn.test.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.javalearn.infrastructure.redis.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Created suyunlong
 * @Date 2025/3/12 22:00
 * @Email loongloongking@gmail.com
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class RedisTest {
    @Resource
    private RedisService redisService;

    private static final String REDIS_TEST_KEY = "test";
    private static final String REDIS_TEST_VALUE = "hello world";

    @Test
    public void testRedisPut(){
        redisService.setValue(REDIS_TEST_KEY,REDIS_TEST_VALUE);
        Assert.assertEquals(REDIS_TEST_VALUE, redisService.getValue(REDIS_TEST_KEY));
    }
}
