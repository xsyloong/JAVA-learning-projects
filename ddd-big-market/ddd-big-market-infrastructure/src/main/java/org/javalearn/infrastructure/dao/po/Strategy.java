package org.javalearn.infrastructure.dao.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Created suyunlong
 * @Description Strategy实体类
 * @Date 2025/3/9 20:07
 * @Email loongloongking@gmail.com
 */
@Data
@Accessors( chain = true )
public class Strategy {
    /**
     * 自增ID
     */
    private Long id;
    /**
     * 策略ID
     */
    private Long strategyId;
    /**
     * 策略描述
     */
    private String strategyDesc;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
