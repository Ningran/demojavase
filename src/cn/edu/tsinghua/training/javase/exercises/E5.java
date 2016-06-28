package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/21.
 */
//利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
public class E5 {
    public static void main(String[] args) {
        int score= 60;
        if (score>= 90){
            System.out.println("A");
        }
        else if (score>60){
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }

    }
}
