package cn.edu.tsinghua.training.javase.classroom;

import sun.security.util.Length;

/**
 * Created by Administrator on 2016/6/30.
 */
public class Test {
    public static void main(String[] args) {
        String s = "hello...";
        String s1 = "hi...";
        String s2 = "see you..";
        String s3 = "see you..";
        String s4 = "See You..";

        System.out.println(s.charAt(0));
        System.out.println(s.concat(s));
        System.out.println(s.contains(s));
        System.out.println(s.endsWith(s1));
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s4));//字符串相同返回值true,忽略大小写
        System.out.println(String.format(s, ""));


//        System.out.println(s.getBytes());

        System.out.println(s.indexOf(s2));//返回某个指定字符串值在字符串中首次出现的位置，从0开始，检索的值没有出现，返回-1


        System.out.println(s.isEmpty());
        System.out.println(s.lastIndexOf(s));
        System.out.println(s.length());
        System.out.println(s.matches(s));
//        System.out.println(s.replace());
        System.out.println(s.replaceAll("李四","男"));
        System.out.println(s.replaceFirst("张三","男"));
        System.out.println(s.split(s));
        System.out.println(s.startsWith(s));
        System.out.println(s.substring(1));
        System.out.println(s.toCharArray());
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.valueOf(1.2));


    }


}
