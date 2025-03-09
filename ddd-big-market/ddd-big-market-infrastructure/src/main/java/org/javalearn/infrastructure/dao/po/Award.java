package org.javalearn.infrastructure.dao.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @Created suyunlong
 * @Description Award
 * @Date 2025/3/9 20:20
 * @Email loongloongking@gmail.com
 */
@Data
@Accessors(chain = true)
public class Award {
    /**
     * 自增ID
     */
    private Long id;
    /**
     * 抽奖奖品ID内部流转使用
     */
    private Long awardId;
    /**
     * 奖品对接标识每一个都是一个对应的发奖策略
     */
    private String awardKey;
    /**
     * 奖品配置信息
     */
    private String awardConfig;
    /**
     * 奖品内容描述
     */
    private String awardDesc;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
