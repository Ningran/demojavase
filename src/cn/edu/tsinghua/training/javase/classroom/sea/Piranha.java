package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public class Piranha extends Fish{
    public Piranha(String name) {

        super(name);
    }

    @Override
    public void swim() {
        System.out.println(""+ grtName());
    }


}
