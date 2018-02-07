/** 
 * Project Name:eclipse2018 
 * File Name:ListTestDemo.java 
 * Package Name:com.docker.collection.demo 
 * Date:2018年2月7日上午11:15:06 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/** 
 * ClassName:ListTestDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年2月7日 上午11:15:06 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class ListTestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Listshow(list);
    }

    private static void Listshow(List<String> list) {
        list.add("abc1");
        list.add("abc2");
        list.add("abc3");
        System.out.println("list:"+list);
        
        ListIterator<String> it = list.listIterator();//获取列表迭代器
        //它可以实现在迭代过程中完成对元素的增删改查
        //只有List集合具备该功能
        while(it.hasNext()){
            Object obj = it.next();
            if(obj.equals("abc2")){
                it.add("abc9");
            }
        }
        System.out.println("list:"+list);
        //倒序排序 
        while(it.hasPrevious()){
            System.out.println("previous:"+it.previous());
            
        }
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            Object obj = it.next();//java.util.ConcurrentModificationException
//                    //在迭代器过程中，不要使用集合操作元素，容易抛出异常。
//                    //可以使用Iterator接口的子接口ListIterator来完成在迭代中对元素的增删改查操作
//            if(obj.equals("abc2")){
//                list.add("abc9");
//            }
//            else
//                System.out.println("next:"+obj);
//        }
//        System.out.println(list);
//        while(it.hasNext()){
//            System.out.println("next:"+it.next());
//        }
//        for(int x = 0; x<list.size(); x++){
//            System.out.println("get:"+list.get(x));
//        }
    }
    
}
 