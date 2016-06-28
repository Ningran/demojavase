package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/27.
 */
public class Calculator {


    int add(int i,int j){
        return i + j;
    }
    int sub( int i,int j){
        return i - j;
    }
    int mul(int i, int j){
        return i * j;
    }
    int div(int i,int j){
        return i / j;
    }

    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        Calculator calculator = new Calculator();
        System.out.println(i + "+" + j + "=" +calculator.add(i,j));
        System.out.println(i + "-" + j + "=" +calculator.sub(i,j));
        System.out.println(i + "*" + j + "=" +calculator.mul(i,j));
        System.out.println(i + "/" + j + "=" +calculator.div(i,j));
    }
}
