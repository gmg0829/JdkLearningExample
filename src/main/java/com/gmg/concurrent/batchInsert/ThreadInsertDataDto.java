package com.gmg.concurrent.batchInsert;

import java.util.Set;
import java.util.concurrent.Callable;

/**
 * @author gmg
 * @title: ThreadInsertDataDto
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/12/24 14:23
 */
public class ThreadInsertDataDto implements Callable<Boolean> {

    private DataService dataService;
    private Set<String> set;

    public ThreadInsertDataDto(DataService dataService, Set<String> set) {
        this.dataService = dataService;
        this.set = set;
    }

    //TODO:实际的插入数据到数据库表的真正逻辑
    @Override
    public Boolean call() throws Exception {
        if (dataService!=null){
            dataService.insertBatchData(set);
        }
        return true;
    }
}