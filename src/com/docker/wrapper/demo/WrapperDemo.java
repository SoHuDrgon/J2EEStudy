/** 
 * Project Name:eclipse2018 
 * File Name:WrapperDemo.java 
 * Package Name:com.docker.wrapper.demo 
 * Date:2018年1月10日下午2:54:35 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.wrapper.demo;  
/** 
 * ClassName:WrapperDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年1月10日 下午2:54:35 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class WrapperDemo {

    public static void main(String[] args) {
    /*
     *基本数据类型对象包装类
     *为了方便操作基本数据类型值，将其封装成了对象，在对象中定义了属性和行为丰富了该数据的操作
     *用于描述该对象的类就称为基本数据类型对象包装类
     *byte      Byte
     *short     Short
     *int       Integer
     *long      Long
     *float     Float
     *double    Double
     *char      Character
     *boolean   Boolean
     *该包装对象主要用基本类型和字符串之间的转换
     *基本类型---->字符串
     *  1.基本类型数值+""
     *  2.用string类的静态方法valueOf(基本类型数值);
     *  3.用Integer的静态方法valueOf();
     *字符串---->基本类型
     *  1.使用包装类中的静态方法 xxx parseXXX("xxx类型的字符串");
     *      int parseInt("intString"+"");
     *      long parseLong("longString"+"");
     *      boolean parseBoolean("booleanstring");
     *      只有Character没有parse方法
     *  2.如果字符串被Integer进行对象的封装
     *      可以使用一个非静态方法：
     *      将一个Integer对象转换成基本数据类型值
     *整数具有不同的进制提醒
     *十进制转换其他进制
     *  toBinaryString
     *  toOctalString
     *  toHexString
     *其他进制转换十进制
     *  parseInt("String",radix);
     */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.toBinaryString(-6));
        
        Integer i = new Integer(5);
        System.out.println(i.intValue());
        
        System.out.println("123"+1);
        int x = Integer.parseInt("123");
        System.out.println(x+1);
        
        int num = 4;
        //十进制转换
        System.out.println(Integer.toBinaryString(num));
        System.out.println(Integer.toOctalString(num));
        System.out.println(Integer.toHexString(num));
        //其他进制转换
        System.out.println(Integer.parseInt("110",10));
        System.out.println(Integer.parseInt("110",2));
        
        //自动装箱拆箱
        Integer a = new Integer("3");
        Integer b = new Integer(3);
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a.compareTo(b));
        
        /*
         * JDK1.5以后，简化了基本数据类型对象包装类定义方式
         * Integer x = new Integer(4);可以直接写成
         * Integer x = 4;//自动装箱
         * x = x + 5;//自动拆箱，通过intValue方法
         * 需要注意：
         *  在使用时，Integer x = null;上面的代码会出现NullPointerException
         */
    }

}
 