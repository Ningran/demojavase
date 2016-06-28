package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/27.
 */
//同名方法的重载
public class Overload {
    int i;
    double d;
    boolean b;


    public Overload(){
        this.i = i;
        this.d = d;
        this.b = b;
    }

    public Overload(int i) {
        this.i = i;
    }

    public Overload(double d) {
        this.d = d;
    }

    public Overload(int i, double d, boolean b) {
        this.i = i;
        this.d = d;
        this.b = b;
    }
}
