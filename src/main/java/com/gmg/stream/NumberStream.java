package com.gmg.stream;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author gmg
 * @title: NumberStream
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/3/28 10:39
 */
public class NumberStream {
    private static final DecimalFormat df = new DecimalFormat("0.00");//保留两位小数点
    public static void main(String[] args) {
        Random random = new Random();
        List<User> list = new ArrayList<>();
        for(int i=1;i<=5;i++) {
            double weight = random.nextDouble() * 100 + 100;//随机身高：100-200
            User u = new User(i, "用户-" + i, weight);
            list.add(u);
        }
        System.out.println("用户：" + list);
        double sum = list.stream().mapToDouble(User::getHeight).sum();
        System.out.println("身高 总和：" + df.format(sum));
        double max = list.stream().mapToDouble(User::getHeight).max().getAsDouble();
        System.out.println("身高 最大：" + df.format(max));
        double min = list.stream().mapToDouble(User::getHeight).min().getAsDouble();
        System.out.println("身高 最小：" + df.format(min));
        double average = list.stream().mapToDouble(User::getHeight).average().getAsDouble();
        System.out.println("身高 平均：" + df.format(average));

    }
    private static class User{
        Integer id;
        String name;
        double height;//身高

        public User(Integer id, String name, double height) {
            this.id = id;
            this.name = name;
            this.height = height;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", height=" + height +
                    '}';
        }
    }

}
