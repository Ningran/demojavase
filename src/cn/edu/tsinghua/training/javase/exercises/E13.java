package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/22.
 */
//一个整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？
public class E13 {
    public static void main(String[] args) {
        int n = 1;
        while (true){
            if ((int)Math.sqrt(n + 100) ==Math.sqrt(n + 100)&&(int)Math.sqrt(n + 100 + 168)==Math.sqrt(n + 100 + 168)){
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
