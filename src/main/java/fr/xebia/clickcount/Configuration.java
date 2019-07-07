package fr.xebia.clickcount;

import javax.inject.Singleton;

@Singleton
public class Configuration {

    public final String redisHost;
    public final int redisPort;
    public final int redisConnectionTimeout;  //milliseconds

    public Configuration() {
        String redisHostEnv = System.getenv("REDIS_HOST");
        redisHost = (redisHostEnv != null) ? redisHostEnv : "redis";
        String redisPortEnv = System.getenv("REDIS_PORT");
        redisPort = (redisPortEnv != null) ? Integer.valueOf(redisPortEnv) : 6379;
        redisConnectionTimeout = 2000;
    }
}
