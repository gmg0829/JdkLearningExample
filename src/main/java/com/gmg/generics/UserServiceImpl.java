package com.gmg.generics;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author gmg
 * @title: UserServiceImpl
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 20:37
 */
public class UserServiceImpl implements UserService {

    @Override
    public String getUsers(Object o) {
        return "";
    }

    @Override
    public Map getMap() {
        return null;
    }

    @Override
    public List<?> getList() {
        List<Integer> list=new LinkedList<>();
        return list;
    }

    @Override
    public Integer getE() {
        List<Integer> list=new LinkedList<>();
        return list.get(0);
    }
}
