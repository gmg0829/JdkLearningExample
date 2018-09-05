package com.gmg.proxy.staticProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  10:59
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        IUserService iUserService=new UserServiceImpl();
        UserServiceProxy userServiceProxy=new UserServiceProxy(iUserService);
        userServiceProxy.add("代理");
    }
}
