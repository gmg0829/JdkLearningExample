package com.gmg.proxy.dynamicProxy.cglibProxy;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/9/5  11:36
 */
public class CglibTset {
    public static void main(String[] args) {
        IUserService iUserService=(IUserService) new CGLibProxy().createProxyObject(new UserServiceImpl());
        iUserService.add("add");
        iUserService.delete("delete");
    }
}
