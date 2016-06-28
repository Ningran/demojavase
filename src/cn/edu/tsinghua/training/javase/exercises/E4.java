package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/21.
 */
//将一个正整数分解质因数。例如：输入90，打印出90=2*3*3*5。
public class E4 {
    public static void main(String[] args) {
        int n = 540;
        System.out.print(n + "=");
        compute(n);
    }
    static void compute(int n){
        for(int i = 2;i < n + 1;i ++){
            if(i == n){
                System.out.print(i);
            }else if (n % i == 0){
                System.out.print(i + "*");
                compute(n / i);
                break;
            }
        }
    }
}
