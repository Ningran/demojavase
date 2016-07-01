package cn.edu.tsinghua.training.javase.classroom;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;

/**
 * Created by ${NingRan} on 2016/6/30.
 */
//数组
public class Array {
    public static void main(String[] args) {
        int [] ints = new int[10];


        for (int i = 0; i < 10; i++) {
            ints[i] = i;
        }


        String[] strings ={"hi","hello","test","hello","test","hello","test","hello","test"};


        System.out.println(ints[5]);
        System.out.println(ints.length);
        System.out.println(strings[1]);
        System.out.println(strings[strings.length - 1]);

        for (String string : strings) {
            System.out.println(string);
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(i);
            System.out.println(strings[i]);
        }

        Object[] objects = {1,"asdf",true,1.234,new Array()};
        for (Object object : objects) {
            System.out.println(object);
        }
        System.out.println(Arrays.toString(strings));
    }
}
class Mankind extends Array{
    private String name;
    private int age;
    private char gender;

    public Mankind(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Mankind mankind = new Mankind("zhangsan",18,'M');
        System.out.println(mankind);
    }

    @Override
    public String toString() {
        return "Mankind{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}