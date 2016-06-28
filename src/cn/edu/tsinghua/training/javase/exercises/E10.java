package cn.edu.tsinghua.training.javase.exercises;

/**
 * Created by Administrator on 2016/6/22.
 */
//一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
public class E10 {
    double height;

    public E10(double height){
        this.height= height;
    }
    double totalDistance(int n){
        double sum = 0;
        for (int i = 1 ;i< n + 1;i ++){
            sum += reboundHeight(i-1)*2;
        }
        return height + sum;
    }
    double reboundHeight(int n) {
        if (n == 0) {
            return 0;
        } else {
            return height / Math.pow(2, n);
        }
    }
}

class E10Test{
    public static void main(String[] args) {
        E10 e10=new E10(100);
        int n = 10;
        System.out.println("total distance:"+ e10.totalDistance(n));
        System.out.println("rebound height of" + n + e10.reboundHeight(n));
    }
}
