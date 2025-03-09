package org.javalearn.test.infrastructure;

import lombok.extern.slf4j.Slf4j;
import org.javalearn.infrastructure.dao.StrategyDao;
import org.javalearn.infrastructure.dao.po.Strategy;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Created suyunlong
 * @Date 2025/3/9 22:50
 * @Email loongloongking@gmail.com
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class DaoTest {
    @Resource
    private StrategyDao strategyDao;

    @Test
    public void testStrategyDaoQuery(){
        List<Strategy> all = strategyDao.getAll();
        Assert.assertEquals(6, all.size());
    }
}
