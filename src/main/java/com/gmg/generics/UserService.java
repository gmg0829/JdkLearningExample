package com.gmg.generics;

import java.util.List;
import java.util.Map;

/**
 * @author gmg
 * @title: UserService
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 20:36
 */
public interface UserService<R,T,K,V,E> {
   R getUsers(T t);

   Map<K,V> getMap();

   List<?> getList();

   E getE();
}
