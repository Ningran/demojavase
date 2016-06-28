package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/22.
 */
public class WhileTest {
    public static void main(String[] args) {
        for (int j = 0;j < 10;j ++) {
            for(int k = 0;k < 10; k ++){
                if(k == 5){
                    break;
                }
                System.out.print(j +","+ k+ '\t');
            }
            System.out.println();

        }
    }
}
