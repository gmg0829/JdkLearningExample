package com.gmg.optional;

import java.util.Optional;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2019/3/13  9:47
 */
public class OptionalDemo {
    public static void main(String[] args) {
        User user=null;
        Optional<String> stringOptional=Optional.ofNullable(null);//hello
        Optional<User> userOptional=Optional.ofNullable(user);
        System.out.println(stringOptional.orElse("hi"));//如果实例非空，返回该实例
        String a=stringOptional.orElseGet(()->{
            return new String("gmg");
        });
        System.out.println(a);
        System.out.println(userOptional.isPresent());
        Optional<String> stringOptional_= stringOptional.map((s)->s.toUpperCase());
        stringOptional_.ifPresent((s)->{
            System.out.println(s);
        });
    }

    class User{
        private String userName;
        private String passWord;

        public User(String userName, String passWord) {
            this.userName = userName;
            this.passWord = passWord;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getPassWord() {
            return passWord;
        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }
    }
}
