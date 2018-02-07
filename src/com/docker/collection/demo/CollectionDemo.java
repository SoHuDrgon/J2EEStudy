/** 
 * Project Name:eclipse2018 
 * File Name:CollectionDemo.java 
 * Package Name:com.docker.collection.demo 
 * Date:2018年2月6日上午10:37:29 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.collection.demo;

import java.util.ArrayList;
import java.util.Collection;

/** 
 * ClassName:CollectionDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年2月6日 上午10:37:29 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class CollectionDemo {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        show(coll);
        Collection<String> c1 = new ArrayList<String>();
        Collection<?> c2 = new ArrayList<Object>();
        show1(c1,c2);
    }
    public static void show(Collection<String> coll){
        //添加元素   add()
        coll.add("abcd");
        coll.add("1234");
        coll.add("ABCD");
        //删除元素 remove()
        coll.remove("1234");
        System.out.println(coll.contains("abcd"));
        //清空集合  clear();
        coll.clear();
        System.out.println(coll);
        coll.add("ABCD");
        System.out.println("coll:"+coll);
    }
    public static void show1(Collection<String> c1 ,Collection<?> c2){
        //给c1添加元素
        c1.add("abc1");
        c1.add("abc3");
        c1.add("abc4");
        //给c2添加元素
        c1.add("abc2");
        c1.add("abc4");
        c1.add("abc6");
        
        System.out.println("c1:"+c1);
        System.out.println("c1:"+c2);
        //演示addAll
        c1.addAll((Collection<? extends String>) c2);   //c1添加c2全部
        System.out.println("c1:"+c1);
        //演示removeAll
        boolean B = c1.removeAll(c2);
        System.out.println("removeAll:"+B);
        System.out.println("c1:"+c1);
        //演示containsAll
        boolean b = c1.contains(c2);
        System.out.println("ContainsAll:"+b);
        //演示retainAll
        boolean  b1 = c1.retainAll(c2);//取交集，保留和指定的集合相同的元素，而删除不同的元素。
        System.out.println("b1:"+b1);
        System.out.println("c1:"+c1);
    }
}
 