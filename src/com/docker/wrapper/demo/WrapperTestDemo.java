/** 
 * Project Name:eclipse2018 
 * File Name:WrapperTestDemo.java 
 * Package Name:com.docker.wrapper.demo 
 * Date:2018年1月17日上午8:41:58 
 * Copyright (c) 2018, guogang1990@gmail.com All Rights Reserved. 
 * 
*/  
  
package com.docker.wrapper.demo;

import java.util.Arrays;

/** 
 * ClassName:WrapperTestDemo <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2018年1月17日 上午8:41:58 <br/> 
 * @author   Administrator 
 * @version   
 * @since    JDK 1.8 
 * @see       
 */
public class WrapperTestDemo {
/*
 * 对一个字符串中的数值进行从小到大排序
 * "20 78 9 -7 88 38 29"
 * 
 * 思路
 * 1.排序   int
 * 2.如何获取这个字符串中的这些需要排序的数值？
 * 发现这个字符串中都是用空格来对数值进行分个
 * 所以就想到用字符串对象的切割方法来将大串变成小串
 * 3.数值最终变成了小字符串，怎么变成int数？
 * 字符串--->基本类型 使用基本包装类
 */
    //private static final String SPACE_SEPARATOR = " ";
    public static void main(String[] args) {
        String numStr = "20 78 9 -7 88 38 29";
        //String numStr = "20 78 9 -7 88  38 29";
        System.out.println(numStr);
        numStr = sortStringNumber(numStr);
        System.out.println(numStr);
    }

private static String sortStringNumber(String numStr) {
    //将字符串变成字符串数组
    String[] str_arr = stringToArray(numStr);
    //将字符串数组变成int数组
    int[] num_arr = toIntArray(str_arr);
    //对int排序
    mySortArray(num_arr);
    //将排序的int数组变成字符串
    String temp = arrayToString(num_arr);
    return temp;
}



private static String arrayToString(int[] num_arr) {
    StringBuilder sb = new StringBuilder();
    for ( int x = 0; x < num_arr.length; x++) {
        if(x!=num_arr.length-1)
            sb.append(num_arr[x]+" ");
        else
            sb.append(num_arr[x]);
    }
    return sb.toString();
}

private static void mySortArray(int[] num_arr) {
    Arrays.sort(num_arr);
}

public static int[] toIntArray(String[] str_arr) {
    int[] arr = new int[str_arr.length];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = Integer.parseInt(str_arr[i]);
    }
    return arr;
}

public static String[] stringToArray(String numStr) {
    String[] str_arr = numStr.split(" ");
    //String[] str_arr = numStr.split(SPACE_SEPARATOR+);
    return str_arr;
}
}
 