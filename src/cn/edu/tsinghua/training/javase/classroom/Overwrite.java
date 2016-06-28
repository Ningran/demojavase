package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/27.
 */
//子类重写将覆盖父类方法
public class Overwrite {
    void method(){
        System.out.println("method in super class...");
    }
}
class SubOverwrite extends  Overwrite{
    void method(){
        super.method();//子类何时调用父类方法根据需求确定
        System.out.println("method in sub class...");
    }

    public static void main(String[] args) {
        SubOverwrite subOverwrite = new SubOverwrite();
        subOverwrite.method();
    }


}