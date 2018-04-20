package com.gmg.guava;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by gmg on on 2018-01-22 14:08.
 */
public class GuavaCollectionDemo {
    public static void main(String[] args) {
        List list= Lists.newArrayList();
        list.add("aa");
        list.add("bb");
        list.add("cc");
        String result= Joiner.on("-").join(list);
        //System.out.println(result);

        String str = "1-2-3-4-5-6";
        List<String> splitToList= Splitter.on("-").splitToList(str);
       // System.out.println(splitToList);


        String str1 = "xiaoming=11,xiaohong=23";
        Map<String,String> StringMap = Splitter.on(",").withKeyValueSeparator("=").split(str1);
        System.out.println(StringMap);


        Set set= Sets.newHashSet();

        Map<String,Integer> map= Maps.newHashMap();
        map.put("xiaoming", 12);
        map.put("xiaohong",13);
        String mapResult = Joiner.on(",").withKeyValueSeparator("=").join(map);
       // System.out.println(mapResult);



        //无序+可重复 count()方法获取单词的次数 增强了可读性+操作简单
        //Multimap: key-value key可以重复
        Multimap<String,Integer> multimap= ArrayListMultimap.create();
        multimap.put("aa",1);
        multimap.put("aa",2);
       // System.out.println(multimap.get("aa"));


    }
}
