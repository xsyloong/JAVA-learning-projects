package org.javalearn.infrastructure.adapter.mapper;

import org.javalearn.domain.strategy.model.entity.StrategyAwardEntity;
import org.javalearn.infrastructure.dao.po.StrategyAward;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @Created suyunlong
 * @Date 2025/3/13 00:16
 * @Email loongloongking@gmail.com
 */
@Mapper
public interface StrategyAwardEntityConvetor {

    StrategyAwardEntityConvetor INSTANCE = Mappers.getMapper(StrategyAwardEntityConvetor.class);

    StrategyAwardEntity toStrategyAwardEntity(StrategyAward strategyAward);

    List<StrategyAwardEntity> toStrategyAwardEntityList(List<StrategyAward> strategyAward);
}
