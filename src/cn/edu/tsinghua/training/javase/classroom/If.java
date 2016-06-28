package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/21.
 */
public class If {
    public static void main(String[] args) {
        {
            int score = 75;
            if (score >= 80) {
                System.out.println("A");
            } else if (score >= 70) {
                System.out.println("B");
            } else if (score >= 60) {
                System.out.println("C");
            } else {
                System.out.println("D");
            }


        }
    }
}
