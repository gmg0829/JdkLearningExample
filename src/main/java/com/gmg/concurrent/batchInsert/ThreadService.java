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

    //TODO:������ȡ���������� - 40w
    public void insertDatas() throws Exception{
        //TODO:���߳��� 10
        final Integer threadSize=10;

        //TODO:�������� 40w
        final Long total=dataMapper.getTotal();

        if (total>0){
            //TODO:ÿ���߳̽�ִ�в��������������Ŀ
            Long pageSize=(total%threadSize==0)?total/threadSize:total/threadSize+1;

            Set<String> datas;
            ExecutorService executorService=Executors.newFixedThreadPool(threadSize);

            List<ThreadInsertDataDto> list=new ArrayList<>();
            for (Long i=1L;i<=threadSize;i++){
                //TODO:��ÿ���̼߳���ִ�еľ�����Ŀ��¼�ó���
                if (Objects.equals(i, threadSize)){
                    pageSize = total - (threadSize-1) * pageSize;
                }
                datas=dataService.pageLimitData(i,pageSize);

                //TODO�������߳�ʵ��
                list.add(new ThreadInsertDataDto(dataService,datas));
            }
            //TODO:���߳�������������-�߼�
            executorService.invokeAll(list);
        }
    }
}
