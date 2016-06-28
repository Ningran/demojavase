package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/28.
 */
public abstract class AbstractTest {
    public abstract String method(String s);

    public void m(){

    }
    public abstract void m2();


    public static void main(String[] args) {
        SubAbstractTest subAbstractTest = new SubAbstractTest();
        subAbstractTest.m2();
        subAbstractTest.m();
        subAbstractTest.method("");
    }
}


class SubAbstractTest extends AbstractTest{

    @Override
    public String method(String s) {
        return null;
    }
    public void m2(){

    }
}