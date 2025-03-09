package org.javalearn.infrastructure.dao;

import org.apache.ibatis.annotations.Mapper;
import org.javalearn.infrastructure.dao.po.Strategy;

import java.util.List;

/**
 * @Created suyunlong
 * @Description StrategyDao
 * @Date 2025/3/9 21:06
 * @Email loongloongking@gmail.com
 */
@Mapper
public interface StrategyDao {

    List<Strategy> getAll();

}
