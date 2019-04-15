package com.gmg.design.mediator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 抽象中介这
 * @date 2019/1/23  9:42
 */
public abstract class AbstractMediator {
    protected MysqlDatabase mysqlDatabase;
    protected RedisDatabase redisDatabase;
    protected EsDatabase esDatabase;

    public abstract void sync(String databaseName, String data);


    public MysqlDatabase getMysqlDatabase() {
        return mysqlDatabase;
    }

    public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
        this.mysqlDatabase = mysqlDatabase;
    }

    public RedisDatabase getRedisDatabase() {
        return redisDatabase;
    }

    public void setRedisDatabase(RedisDatabase redisDatabase) {
        this.redisDatabase = redisDatabase;
    }

    public EsDatabase getEsDatabase() {
        return esDatabase;
    }

    public void setEsDatabase(EsDatabase esDatabase) {
        this.esDatabase = esDatabase;
    }
}
