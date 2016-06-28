package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/23.
 */
//求解汉诺塔 n 圆盘移动步骤
public class E52 {


    int counter;

    public void hanoi(int n,char src,char with,char dest ) {


        if(n == 1){
            System.out.println(src + "->"+ dest);
            counter++;
        }else {
            hanoi(n - 1,src,dest,with);
            System.out.println(src + "->"+ dest);
            counter++;
            hanoi(n - 1,with,src,dest);
        }

    }

}
