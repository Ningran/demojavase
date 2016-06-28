package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/22.
 */
//输出9*9口诀。
public class E16 {
    public static void main(String[] args) {
        for(int i=1;i<10;i++){
            for(int j=1;j<i;j++){
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}
