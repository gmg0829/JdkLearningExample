package com.gmg.map;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.UnknownHostException;
import java.util.*;
import java.util.Map.Entry;


public class MapDemo {
  
	
public static void main(String[] args) throws UnknownHostException,UnsupportedEncodingException {

      HashMap<String,String> map=new HashMap<String, String>();
      map.put("1","11");
      map.put("2", "22");
      map.put("3", "33");
      for (Entry<String,String> entry: map.entrySet()) {
         // System.out.println("key"+entry.getKey()+"value"+entry.getValue());

      }
      map.forEach((key,value)->{
            System.out.println("key:"+key+"value:"+value);
      });
      Set<String> stringSet=map.keySet();
      Iterator<String> stringIterator=stringSet.iterator();
      for(String s:stringSet){
            System.out.println( map.get(s));
      }
      while (stringIterator.hasNext()){
            System.out.println(map.get(stringIterator.next()));
      }
      System.out.println("======================================================");
      SortedMap<String,String> sort=new TreeMap<String,String>(map);  
      Set<Entry<String,String>> entry1=sort.entrySet();  
      Iterator<Entry<String,String>> it=entry1.iterator();  
      while(it.hasNext())  
      {  
             Entry<String,String> entry=it.next();
            //System.out.println("key"+entry.getKey()+"value"+entry.getValue());
      }
      System.out.println(ConvertMapToUrlParam(map));

}

      public static String  ConvertMapToUrlParam(Map<String, String> params) throws IllegalArgumentException, UnsupportedEncodingException {
            StringBuffer sb = new StringBuffer();
            if(params.isEmpty()){
                  throw new IllegalArgumentException("请求参数集合不能为空");
            }else{
                  Set<String> keySet = params.keySet();
                  for(String key:keySet){
                        sb.append("&")
                                .append(key)
                                .append("=")
                                .append(URLDecoder.decode(params.get(key), "utf-8"));
                  }
            }
            return sb.toString().substring(1);
      }

}
