package cn.edu.tsinghua.training.javase.exercises;

import java.util.Scanner;

/**
 * Created by Administrator on 2016/6/21.
 */
//输入两个正整数m和n，求其最大公约数和最小公倍数。
public class E6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("input M:");
        int m = scanner.nextInt();
        System.out.println("input N:");
        int n = scanner.nextInt();

        for (int i = Math.min(m,n); i > 0 ; i--) {
            if(m % i == 0 && n % i == 0){
                System.out.println(i);
                break;
            }

        }
        for (int i = Math.max(m,n); ; i++) {
            if(i % m == 0 && i % n == 0){
                System.out.println(i);
                break;
            }

        }
    }
}
