package com.gmg.thread.ch3.join;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * Created by gmg on 2018/10/27.
 */
public class FightQueryTask extends Thread implements FightQuery {

    private final String orign;
    private final String destination;
    private final List<String> fightList=new ArrayList<>();
    public FightQueryTask(String fight,String orign,String destination){
        super("["+fight+"]");
           this.orign=orign;
           this.destination=destination;
    }
    @Override
    public List<String> get() {
        return this.fightList;
    }

    @Override
    public void run() {
        System.out.printf("%s-query from %s to %s\n",getName(),orign,destination);
        int random= ThreadLocalRandom.current().nextInt(10);
        try {
            TimeUnit.SECONDS.sleep(random);
            this.fightList.add(getName()+"-"+random);
            System.out.printf("%s查询成功\n",getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
