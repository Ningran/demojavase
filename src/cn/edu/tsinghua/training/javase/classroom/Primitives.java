package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/30.
 */
//基本数据类型的封装类
public class Primitives {
    public static void main(String[] args) {
        boolean b;
        byte b1;
        short s;
        char c;

        long l;
        double d;
        float f;

        Boolean b2 = new Boolean(false);
        Byte b3 = new Byte((byte) 123);
        System.out.println(Integer.MAX_VALUE);

        int i = 123;
        String s1 = String.valueOf(i);

        String s2 = "456";
        int i1 = Integer.parseInt(s2);
        System.out.println(i1 + 456);

        String s3 = "23.45";
        Double v = Double.parseDouble(s3);


    }



}
