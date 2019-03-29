package com.gmg.stream;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class
ListStream {
 public static void main(String[] args) {
	 List<String> list = new ArrayList<>();
     list.add("aa");
     list.add("cccc");
     list.add("bbb");
//     list.stream().forEach(System.out::println);
     List<String> list1=list.stream().filter(str->str.startsWith("aa")).collect(Collectors.toList());
     //list1.stream().forEach(System.out::println);
     String phone = "13123456789";
     String phoneNumber = phone.replaceAll("(\\d{3})\\d{4}(\\d{4})","$1****$2");
     System.out.println(phoneNumber);

     List<Apple> inventory = Arrays.asList(new Apple(80,"green"),
             new Apple(155, "green"),
             new Apple(120, "red"));
     List<Apple> greenApples2=inventory.stream().filter((Apple apple)->"green".equals(apple.getColor())).collect(Collectors.toList());
     System.out.println(greenApples2);
     List<Apple> listLimit=inventory.stream().limit(2).skip(1).collect(Collectors.toList());
     System.out.println(listLimit);
     //Optional.ofNullable(inventory).orElse(Collections.EMPTY_LIST).stream().map(Apple::getColor).collect(Collectors.toList());

 }
    public static class Apple {
        private int weight = 0;
        private String color = "";

        public Apple(int weight, String color){
            this.weight = weight;
            this.color = color;
        }

        public Integer getWeight() {
            return weight;
        }

        public void setWeight(Integer weight) {
            this.weight = weight;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }
}
