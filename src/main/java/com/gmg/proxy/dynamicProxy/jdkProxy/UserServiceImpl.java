package com.gmg.proxy.dynamicProxy.jdkProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  10:56
 */
public class UserServiceImpl implements IUserService {

    @Override
    public void add(String name) {
        System.out.println("向数据库中插入名为： "+name+" 的用户");
    }

}