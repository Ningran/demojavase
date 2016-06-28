package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/21.
 */
public class Operator {
    public static void main(String[] args) {
        int x= 11;
        int y= 3;

        int z= --x*y;
        System.out.println(z);
        System.out.println(x);
        System.out.println(y);




        double a=8;
        double b=40;

        double c=a/b;
        System.out.println(c);


        float d= 3;
        float f= 15;
        float e= d+f;
        System.out.println(e);

        boolean s= a==d;
        System.out.println(s);


        System.out.println((a>b)^(b>a));

        double i=1;
        i-=2;
        System.out.println(i);


        int number;
        System.out.println(10/3);








    }
}
