package cn.edu.tsinghua.training.javase.classroom;

import com.sun.org.apache.xpath.internal.operations.String;

/**
 * Created by Administrator on 2016/6/30.
 */
//变量作用域的范围：

public class Basic {
    int i;

    public void m1(){
        String s;
    }

    public void m2(){
        int i = 1;
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
            System.out.println(i);
            System.out.println(this.i);
        }
        int j;
        System.out.println(i);
    }

    public static void m3(){
        System.out.println();
    }
}

