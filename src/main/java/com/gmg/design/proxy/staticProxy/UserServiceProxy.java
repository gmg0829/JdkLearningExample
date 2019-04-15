package com.gmg.design.proxy.staticProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  10:56
 */
public class UserServiceProxy implements IUserService{


    private IUserService target;

     //通过构造方法传入被代理对象
    public UserServiceProxy(IUserService target){
        this.target=target;
    }
    public void add(String name) {
        System.out.println("准备向数据库中插入数据");
        target.add(name);
        System.out.println("插入数据库成功");
    }
}
