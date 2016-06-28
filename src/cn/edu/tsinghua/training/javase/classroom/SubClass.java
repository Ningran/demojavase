package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/24.
 */
public class SubClass extends People.Chanese.SuperClass {
    int j;

    public SubClass(int n) {
        super(1);
        System.out.println("引用父类");
    }


    void a3(){

    }
}

class SubClassTest{
    public static void main(String[] args) {
//         People.Chanese.SuperClass superClass= new SubClass();
//        System.out.println(superClass.i);
//        System.out.println(superClass.b);
//        superClass.a1();
//
//        SubClass subClass = new SubClass();
//        System.out.println(subClass.j);
//        System.out.println(subClass.b);
//
//        subClass.a3();
    }
}