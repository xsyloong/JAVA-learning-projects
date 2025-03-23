package org.javalearn.types.common;

public final class Constants {
    private Constants(){}

    public static final String REDIS_PREFIX = "big_market";
    public static final String SPLIT = ",";

    /**
     * 存储在 redis的 key前缀
     */
    public static final class RedisKey {
        private RedisKey(){}

        public static String ACTIVITY_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_activity_key_";
        public static String ACTIVITY_SKU_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_activity_sku_key_";
        public static String ACTIVITY_COUNT_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_activity_count_key_";
        public static String STRATEGY_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_strategy_key_";
        public static String STRATEGY_AWARD_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_strategy_award_key_";
        public static String STRATEGY_AWARD_LIST_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_strategy_award_list_key_";
        public static String STRATEGY_RATE_TABLE_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_strategy_rate_table_key_";
        public static String STRATEGY_RATE_RANGE_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "big_market_strategy_rate_range_key_";
        public static String RULE_TREE_VO_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "rule_tree_vo_key_";
        public static String STRATEGY_AWARD_COUNT_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "strategy_award_count_key_";
        public static String STRATEGY_AWARD_COUNT_QUERY_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "strategy_award_count_query_key";
        public static String STRATEGY_RULE_WEIGHT_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "strategy_rule_weight_key_";
        public static String ACTIVITY_SKU_COUNT_QUERY_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "activity_sku_count_query_key";
        public static String ACTIVITY_SKU_STOCK_COUNT_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "activity_sku_stock_count_key_";
        public static String ACTIVITY_SKU_COUNT_CLEAR_KEY = REDIS_PREFIX + CharacterSymbols.COLON + "activity_sku_count_clear_key_";
        public static String ACTIVITY_ACCOUNT_LOCK = REDIS_PREFIX + CharacterSymbols.COLON + "activity_account_lock_";
        public static String ACTIVITY_ACCOUNT_UPDATE_LOCK = REDIS_PREFIX + CharacterSymbols.COLON + "activity_account_update_lock_";
        public static String USER_CREDIT_ACCOUNT_LOCK = REDIS_PREFIX + CharacterSymbols.COLON + "user_credit_account_lock_";
    }

    /**
     * 常用符号
     */
    public static final class CharacterSymbols {
        private CharacterSymbols() {}

        // 常用符号
        public static final char UNDERSCORE = '_';
        public static final char HYPHEN = '-';
        public static final char DOT = '.';
        public static final char COMMA = ',';
        public static final char COLON = ':';
        public static final char SEMICOLON = ';';

        // 括号类
        public static final char LEFT_PARENTHESIS = '(';
        public static final char RIGHT_PARENTHESIS = ')';
        public static final char LEFT_BRACE = '{';
        public static final char RIGHT_BRACE = '}';

        // 其他常用符号
        public static final char SPACE = ' ';
        public static final char TAB = '\t';
        public static final char NEWLINE = '\n';
    }


}
