package com.gmg.mediator;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 抽象数据库类
 * @date 2019/1/23  9:39
 */
public abstract class AbstractDatabase {
    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
    public static final String ELASTICSEARCH = "elasticsearch";

    protected AbstractMediator mediator;    // 中介者

    public AbstractDatabase(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    public abstract void add(String data);
}
