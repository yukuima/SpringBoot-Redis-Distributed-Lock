package com.myk.learning.redislock.shell;

/**
 * Redis shell
 * <p/>
 * Created in 2018.11.30
 * <p/>
 *
 * @author myk
 */
public class RedisShell {

    /**
     * The constant 解锁脚本.
     */
    public final static String REDIS_UNLOCK = "if redis.call('get', KEYS[1]) == ARGV[1] then return redis.call('del', KEYS[1]) else return 0 end";

}
