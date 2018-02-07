/** 
 * Project Name:eclipse2018 
 * File Name:ListDemo.java 
 * Package Name:com.docker.collection.demo 
 * Date:2018年2月7日上午11:05:24 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.collection.demo;

import java.util.ArrayList;
import java.util.List;

/** 
 * ClassName:ListDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年2月7日 上午11:05:24 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class ListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        show(list);
    }
    
    public static void show(List<String> list){
        //添加元素
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println(list);
        //插入元素
        list.add(1,"abc9");
        System.out.println(list);
        //删除元素
        System.out.println("remove:"+list.remove(2));
        System.out.println(list);
        //修改元素
        System.out.println("set:"+list.set(0, "abc8"));
        System.out.println(list);
        //获取元素
        System.out.println("get:"+list.get(0));
        System.out.println(list);
        //获取子列表
        System.out.println("sublist:"+list.subList(1, 2));
    }

}
 