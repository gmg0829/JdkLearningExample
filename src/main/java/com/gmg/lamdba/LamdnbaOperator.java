package com.gmg.lamdba;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LamdnbaOperator {
  public static void main(String[] args) {
	  List<String> list = new ArrayList<>();
      list.add("aaa");
      list.add("cccc");
      list.add("b");
      list.add("eeeee");
      list.sort(String::compareToIgnoreCase);
      list.forEach(System.out::println);
      list.sort(Comparator.comparing(String::length));
      list.forEach(System.out::println);
}
}
