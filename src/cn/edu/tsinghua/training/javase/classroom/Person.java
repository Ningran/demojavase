package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/28.
 */
public class Person {
    private String name;
    private static  String earth;


    public void m1(){//方法中出现静态static后name不能被引用
        name = "李四";
        earth = "地球";
    }


    public static void main(String[] args) {
        earth = "地球";
        System.out.println(earth);


        Person lisi = new Person();
        lisi.name = "李四";



        Person wanger = new Person();
        wanger.name = "王二";
        wanger.earth = "王二在北京....";


        System.out.println(lisi.name);
        System.out.println(lisi.earth);
        System.out.println(wanger.name);
        System.out.println(wanger.earth);


    }
}