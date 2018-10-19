package com.gmg.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gmg
 * @Title:
 * @Package
 * @Description:
 * @date 2018/10/9  17:02
 */
public class HeapTest
{
    public static void main(String[] args) {
        List<User> list=new ArrayList<User>();
        while (true) {list.add(new User());}
    }
}
