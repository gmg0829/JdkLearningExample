package com.gmg.rpc.server;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/2/22  20:34
 */
public class ProductServer {
    private static final Map<String,Class<?>> map = new HashMap<>();
    static {
        map.put("com.gmg.rpc.api.ProductService",ProductServiceImpl.class);
    }
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(8777);
            Socket socket = serverSocket.accept();
            //读取信息
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            String ClassName = ois.readUTF();
            String methodName = ois.readUTF();
            Class[] paramterTypes = (Class[]) ois.readObject();
            Object[] paramters = (Object[]) ois.readObject();
            Class<?> clazz = map.get(ClassName);
            if (clazz==null)
                throw new Exception("not found "+ClassName);
            Method method = clazz.getMethod(methodName,paramterTypes);
            Object result = method.invoke(clazz.newInstance(), paramters);
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(result);
            oos.close();
            ois.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
