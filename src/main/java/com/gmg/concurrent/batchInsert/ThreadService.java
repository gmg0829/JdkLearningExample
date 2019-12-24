package com.gmg.concurrent.batchInsert;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author gmg
 * @title: ThreadService
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/12/24 14:20
 */
public class ThreadService {

    private DataMapper dataMapper;

    private DataService dataService;

    //TODO:批量拉取、插入数据 - 40w
    public void insertDatas() throws Exception{
        //TODO:总线程数 10
        final Integer threadSize=10;

        //TODO:总数据量 40w
        final Long total=dataMapper.getTotal();

        if (total>0){
            //TODO:每个线程将执行插入操作的数据条目
            Long pageSize=(total%threadSize==0)?total/threadSize:total/threadSize+1;

            Set<String> datas;
            ExecutorService executorService=Executors.newFixedThreadPool(threadSize);

            List<ThreadInsertDataDto> list=new ArrayList<>();
            for (Long i=1L;i<=threadSize;i++){
                //TODO:将每个线程即将执行的具体条目记录拿出来
                if (Objects.equals(i, threadSize)){
                    pageSize = total - (threadSize-1) * pageSize;
                }
                datas=dataService.pageLimitData(i,pageSize);

                //TODO：构造线程实例
                list.add(new ThreadInsertDataDto(dataService,datas));
            }
            //TODO:多线程批量插入数据-逻辑
            executorService.invokeAll(list);
        }
    }
}
