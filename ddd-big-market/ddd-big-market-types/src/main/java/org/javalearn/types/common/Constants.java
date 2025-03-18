package org.javalearn.types.common;

public final class Constants {
    private Constants(){}

    public static final String PROJECT_NAME = "big_market";
    public static final String SPLIT = ",";

    /**
     * 存储在 redis的 key前缀
     */
    public static final class RedisKey {
        private RedisKey(){}

        public static final String STRATEGY_AWARD_LIST_KEY = PROJECT_NAME + ":" + "strategy_award_list";

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
