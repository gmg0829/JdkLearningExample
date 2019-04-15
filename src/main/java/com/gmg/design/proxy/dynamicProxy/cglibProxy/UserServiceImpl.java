package com.gmg.design.proxy.dynamicProxy.cglibProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  10:56
 */
public class UserServiceImpl{

    public void add(String name) {
        System.out.println("向数据库中插入名为： "+name+" 的用户");
    }

    public void delete(String name) {
        System.out.println("向数据库中删除名为： "+name+" 的用户");
    }
}