package com.gmg.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author gmg
 * @title: ConcurrentHashMapTest
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/4/8 14:20
 */
public class ConcurrentHashMapTest {
    /*
     * java8为并发哈希映射提供了批量操作数据操作，即使在其他线程同时操作映射时也可以安全的执行。
     * 批量数据操作会遍历映射并对匹配的元素进行操作。在批量操作过程中，不需要冻结映射的一个快照。除非你恰好知道在这段时间
     * 内映射没有被修改，否则你应该将结果看作是映射状态的一个近似值。批量操作有三类
     * a,search会对每个键或值应用一个函数，直到函数返回一个null的结果。然后search会终止并返回该函数的结果。
     * b,reduce会通过提供的积累函数，将所有的键或指结合起来。c,forEach会对所有键或值对应一个函数。
     * 使用这几种操作时，需要指定一个并行阈值
     * ，如果映射包含的元素数目超过了这个阈值，批量操作以并行的方式执行。如果希望批量操作数据在一个线程执行，
     * 请使用Long.MAX_VALUE作为阈值。如果希望批量操作尽可能使用更多的线程，则应该使用1作为阈值。
     */
    /*
     * 比如希望找到第一个出现超过1000次的的单词，我们需要搜索键和值。 返回结果为第一个匹配的元素，或者没有找到任何元素则返回null
     */
    public static void main(String[] args) {
        ConcurrentHashMap<String, Long> map = new ConcurrentHashMap<>();
        for (int i = 0; i <1000 ; i++) {
            map.merge("a", 2L, Long::sum);
            map.merge("b", 1L, Long::sum);
        }
        //找到第一个出现超过1000次的的单词
        String rs = map.search(1, (k, v) -> v > 1000 ? k : null);
        System.out.println(rs);
        //遍历所有
        map.forEach(1, (k, v) -> System.out.println(k + "->" + v));
        //计算所有值的总和
        Long sum = map.reduceValues(1, Long::sum);
        System.out.println(sum);
        //同forEach一样，你也可以提供一个转换器函数。比如计算长度最长的键
        Integer maxLength = map.reduceKeys(1,
                String::length, //转换器
                Integer::max);	//累加器
        System.out.println(maxLength);


    }



}
