package com.gmg.introspector;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author gmg
 * @title: BeanInfoUtil
 * @projectName JdkLearningExample
 * @description: TODO
 * @date 2019/10/8 16:27
 */
public class BeanInfoUtil {
    public static void main(String[] args) throws Exception {
        UserInfo userInfo=new UserInfo();
        userInfo.setUserName("peida");
        BeanInfoUtil.setPropertyByIntrospector(userInfo, "userName");
    }

    public static void setPropertyByIntrospector(UserInfo userInfo,String userName)throws Exception{
        BeanInfo beanInfo=Introspector.getBeanInfo(UserInfo.class);
        PropertyDescriptor[] proDescrtptors=beanInfo.getPropertyDescriptors();

        Arrays.stream(proDescrtptors).filter(p -> p.getPropertyType() != Class.class).
                map(p -> p.getName()).toArray(String[]::new);

        if(proDescrtptors!=null&&proDescrtptors.length>0){
            for(PropertyDescriptor propDesc:proDescrtptors){
                if(propDesc.getName().equals(userName)){
                    Method methodSetUserName=propDesc.getWriteMethod();
                    methodSetUserName.invoke(userInfo, "alan");
                    System.out.println("set userName:"+userInfo.getUserName());
                    break;
                }
            }
        }
    }
}
