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
	}

}
