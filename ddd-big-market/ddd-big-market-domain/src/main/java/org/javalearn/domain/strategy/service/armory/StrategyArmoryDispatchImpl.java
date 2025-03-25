package org.javalearn.domain.strategy.service.armory;

import com.google.common.collect.Lists;
import lombok.RequiredArgsConstructor;
import org.javalearn.domain.strategy.adapter.repository.StartegyAwardRepository;
import org.javalearn.domain.strategy.model.entity.StrategyAwardEntity;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.*;

/**
 * @Created suyunlong
 * @Date 2025/3/15 18:26
 * @Email loongloongking@gmail.com
 */
@Service
@RequiredArgsConstructor
public class StrategyArmoryDispatchImpl implements StrategyArmory, StrategyDispatch{

    private final StartegyAwardRepository repository;

    @Override
    public Boolean assembleStrategyAwardList(Long strategyId) {
        List<StrategyAwardEntity> strategyAwardList = repository.queryListByStrategyId(strategyId);
        assembleStrategyAwardList(strategyId,strategyAwardList);
        return Boolean.TRUE;
    }

    private void assembleStrategyAwardList(Long strategyId,List<StrategyAwardEntity> strategyAwardList){
        BigDecimal minAwardRate = strategyAwardList.stream()
                                                   .map(StrategyAwardEntity::getAwardRate)
                                                   .min(BigDecimal::compareTo).orElse(BigDecimal.ZERO);

        BigDecimal awardRateRange = convert(minAwardRate);

        List<Long> strategyAwardSearchRateTables = Lists.newArrayListWithCapacity(awardRateRange.intValue());
        for(StrategyAwardEntity strategyAwardEntity : strategyAwardList){
            BigDecimal awadIdListSize = strategyAwardEntity.getAwardRate().multiply(awardRateRange);
            for (int i = 0; i < awadIdListSize.intValue(); i++) {
                strategyAwardSearchRateTables.add(strategyAwardEntity.getAwardId());
            }
        }

        // 乱序
        Collections.shuffle(strategyAwardSearchRateTables);

        Map<Integer,Long> strategyAwardSearchRateMap = new HashMap<>();
        for (int i = 0; i < strategyAwardSearchRateTables.size(); i++) {
            strategyAwardSearchRateMap.put(i,strategyAwardSearchRateTables.get(i));
        }

        repository.cacheAwardSearchRateMap(strategyId, strategyAwardSearchRateTables.size(), strategyAwardSearchRateMap);
    }

    @Override
    public Long getRandomAwardIdByStrategyId(Long strategyId) {
        Integer rateRange = repository.getRateRangeByStrategyId(strategyId);
        return repository.getAwardIdByAwardIdx(strategyId, new SecureRandom().nextInt(rateRange));
    }


    private BigDecimal convert(BigDecimal min) {
        if (BigDecimal.ZERO.equals(min)) return BigDecimal.ONE;

        String minStr = min.toPlainString();

        // 小数点前
        String beginVale = minStr.substring(0, minStr.indexOf("."));
        int beginLength = 0;
        if (Double.parseDouble(beginVale) > 0) {
            beginLength = minStr.substring(0, minStr.indexOf(".")).length();
        }

        // 小数点后
        String endValue = minStr.substring(minStr.indexOf(".") + 1);
        int endLength = 0;
        if (Double.parseDouble(endValue) > 0) {
            endLength = minStr.substring(minStr.indexOf(".") + 1).length();
        }

        return BigDecimal.valueOf(Math.pow(10, beginLength + endLength));
    }


}
