package cn.edu.tsinghua.training.javase.util;

import cn.edu.tsinghua.training.javase.classroom.People;

/**
 * Created by Administrator on 2016/6/27.
 */
public class Test {
    public static void main(String[] args) {


        Util util = new Util();
        Date date = new Date();
        People people = new People();


        java.util.Date date1 = new java.util.Date();


        DefaultTest defaultTest = new DefaultTest();
        defaultTest.m1();
        System.out.println(defaultTest.b);

    }
}
