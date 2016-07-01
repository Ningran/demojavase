package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println();
    }

    @Override
    public void fly() {
        System.out.println();
    }
}
