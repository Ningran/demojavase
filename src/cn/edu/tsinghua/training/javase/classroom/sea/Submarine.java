package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Submarine extends Boat implements Diver {


    public Submarine(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Submarine" + getName());
    }

    @Override
    public void dive() {
        System.out.println("Submarine dive.." + getName());
    }
}
