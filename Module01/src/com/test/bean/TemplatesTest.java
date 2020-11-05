package com.test.bean;

import java.util.ArrayList;

/**
 * @author lkh
 * @create 2020-11-05-8:49
 */
/*
常用模板：
1   psvm    main函数
2   sout    System.out.println
3   soutv   System.out.println("num = " + num);
4   xxx.sout    System.out.println(num);
5   fori    for循环
6   iter    for (String arg : args)
7   itar    for (int j = 0; j < arr.length; j++)
8   list.for/list.fori/list.forr
9   ifn/inn      判断是否为空
10  xxx.null/xxx.nn
11  prsf    生成private static final
12  psfi    生成private static final int
13  psfs    生成private static final String
*/

public class TemplatesTest {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10;
        System.out.println(num);
        System.out.println("num = " + num);
        }


    public void forTest(int[] arr){
        ArrayList list = new ArrayList();
        for (int i = 0; i < list.size(); i++) {

        }
    }

    public void testUpdate(){

    }
}
