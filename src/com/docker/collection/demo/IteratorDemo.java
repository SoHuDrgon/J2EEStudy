/** 
 * Project Name:eclipse2018 
 * File Name:IteratorDemo.java 
 * Package Name:com.docker.collection.demo 
 * Date:2018年2月7日上午10:05:02 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.collection.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/** 
 * ClassName:IteratorDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年2月7日 上午10:05:02 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class IteratorDemo {

    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        System.out.println(coll);
        //使用了collection的Iterator(),调用集合中的迭代器方法，是为了获取集合中的迭代器对象。
//        Iterator<String> it = coll.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
        for(Iterator<String> it = coll.iterator(); it.hasNext();){
            System.out.println(it.next());
        }
    }

}
 