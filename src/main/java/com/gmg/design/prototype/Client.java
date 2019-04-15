package com.gmg.design.prototype;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description: 原型模式
 * @date 2018/9/19  16:28
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException{
        List<EnemyPlane> enemyPlanes = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            //此处随机位置产生敌机
            EnemyPlane ep = EnemyPlaneFactory.getInstance(new Random().nextInt(200));
            enemyPlanes.add(ep);
        }

    }
}
