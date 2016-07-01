package cn.edu.tsinghua.training.javase.classroom.sea;

/**
 * Created by Administrator on 2016/6/29.
 */
public abstract class Fish implements Swimmer{
    private String name;


        public Fish(String name){
        this.name = name;
    }

    public String grtName(){
        return name;
    }
    public abstract void swim();

}
