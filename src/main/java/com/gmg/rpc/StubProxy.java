package com.gmg.rpc;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/22  20:31
 */
public class StubProxy {

    public static Object rpc(Class<?> clazz) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                ObjectOutputStream oos = null;
                ObjectInputStream ois = null;
                Socket socket = null;
                try {
                    socket = new Socket("localhost",8777);
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    //发送调用方法的一些属性
                    oos.writeUTF(clazz.getName());
                    oos.writeUTF(method.getName());
                    oos.writeObject(method.getParameterTypes());
                    oos.writeObject(args);
                    //等待服务端的结果
                    ois = new ObjectInputStream(socket.getInputStream());
                    return ois.readObject();
                }finally {
                    if (oos!=null){
                        try {
                            oos.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    if (ois!=null){
                        try {
                            ois.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                    if (socket!=null){
                        try {
                            socket.close();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        });
    }
}
