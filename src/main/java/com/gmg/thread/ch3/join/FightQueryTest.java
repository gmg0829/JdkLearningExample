package com.gmg.thread.ch3.join;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gmg on 2018/10/27.
 */
public class FightQueryTest {
    //合作的各大航空公司
    private static List<String> fightCompany = Arrays.asList("CSA", "CEA", "CHA");

    private static List<String> query(String orign, String destination) {
        final List<String> result=new ArrayList<>();
        //创建查询航班信息的线程列表
        List<FightQueryTask> tasks=fightCompany.stream().map(f->createTaskSearch(f,orign,destination)).collect(Collectors.toList());
        //启动几个线程
        tasks.forEach(Thread::start);
        //调用每个线程的join方法,阻塞当前线程
        tasks.forEach(t->{
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        //获取每个线程的查询结果，放到result
       tasks.stream().map(FightQuery::get).forEach(result::addAll);
       return result;
    }
    private static FightQueryTask createTaskSearch(String fight,String orign,String destination){
       return new FightQueryTask(fight,orign,destination);
    }

    public static void main(String[] args) {
        List<String> results=query("SH","BJ");
        System.out.println("=====result====");
        results.forEach(System.out::println);
    }
}
