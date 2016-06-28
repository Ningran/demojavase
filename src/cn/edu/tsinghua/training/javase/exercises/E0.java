package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/22.
 */
//1,1,2,3,5,8,13,21,34,55...
public class E0 {
    public static void main(String[] args) {
        int n = 13;
        System.out.println("f("+ n +")="+ f(n));
    }
    static long f(int n){
        if(n == 1|| n == 2){
            return 1;
        }else {
            return f(n - 2)+f(n - 1);
        }
    }
}
