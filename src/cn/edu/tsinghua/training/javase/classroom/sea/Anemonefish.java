package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Anemonefish extends Fish {
    public Anemonefish(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(""+ grtName());
    }
}
