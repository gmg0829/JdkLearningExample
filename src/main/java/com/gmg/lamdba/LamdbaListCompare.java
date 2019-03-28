package com.gmg.lamdba;

import java.util.ArrayList;
import java.util.List;

public class LamdbaListCompare {
	public static void main(String[] args) {
		  List<Integer> list = new ArrayList<Integer>(){{
		  	add(4);
		  	add(6);
		  	add(5);
		  }};
	       /* list.add(4);
	        list.add(1);
	        list.add(3);
	        list.add(6);*/

//	        list.sort(new Comparator<Integer>() {
//	            @Override
//	            public int compare(Integer o1, Integer o2) {
//	                return Integer.compare(o1, o2);
//	            }
//	        });


	      /* list.sort(((o1, o2) -> {
	            return Integer.compare(o1, o2);
	        }));
*/
	        list.sort((a,b)->{
	        	return Integer.compare(a, b);
	        });

	        //list.sort((o1, o2) -> Integer.compare(o1, o2));
           // list.sort((a,b)->Integer.compare(a, b));
	        System.out.println(list.toString());

	        List<Person> list1=new ArrayList<Person>(){{
	        	add(new Person("gmg",12));
	        	add(new Person("yr",13));
			}};
	        list1.sort((Person x,Person y)->x.getAge()<y.getAge()?1:-1);
		    System.out.println(list1.toString());
	}

	private  static class Person{
		String name;
		int age;

		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person{" +
					"name='" + name + '\'' +
					", age=" + age +
					'}';
		}
	}

}
