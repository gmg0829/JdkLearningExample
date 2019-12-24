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

    //TODO:ʵ�ʵĲ������ݵ����ݿ��������߼�
    @Override
    public Boolean call() throws Exception {
        if (dataService!=null){
            dataService.insertBatchData(set);
        }
        return true;
    }
}