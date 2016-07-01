package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Boat implements Swimmer {
    private String name;

    public Boat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void swim() {
        System.out.println();
    }
}
