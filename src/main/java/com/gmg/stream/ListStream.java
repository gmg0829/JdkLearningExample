package com.gmg.stream;

import java.util.ArrayList;
import java.util.List;
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
}
}
