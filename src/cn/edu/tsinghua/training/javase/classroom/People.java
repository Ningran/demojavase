package cn.edu.tsinghua.training.javase.classroom;

import cn.edu.tsinghua.training.javase.exercises.E52;

/**
 * Created by Administrator on 2016/6/23.
 */
public class People {
    String name;
    String gender;
    int age;
    double height;
    double weight;
    boolean isMarried;

    public People() {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }



    public void eat(String food) {
        System.out.println(name+"eat" + food);
    }

    public int sleep(int hour) {
        return hour;
    }

    public int study(int hour) {

        System.out.println("study" + hour);
        return hour;

    }

    public static void main(String[] args) {
        People Lisi = new People();
        System.out.println(Lisi.name);
        System.out.println(Lisi.gender);
        System.out.println(Lisi.age);
        System.out.println(Lisi.height);
        System.out.println(Lisi.weight);
        System.out.println(Lisi.isMarried);


        Lisi.eat("面包");
    }

    /**
     * Created by Administrator on 2016/6/24.
     */
    public static class Chanese extends People {
        String zodisc;
        public Chanese(String name, String gender, int age, double height, double weight, boolean isMarried) {
            super();
        }

    //    public People.Chanese(){
    //        super();
    //
    //        System.out.println();
    //    }

        /**
         * Created by Administrator on 2016/6/24.
         */
        public static class SuperClass {
            boolean b;
            int i;
            double d;


            void a1(){

            }
            void a2(){

            }

            public SuperClass(int n){
                System.out.println("引用父类");
            }

            /**
             * Created by Administrator on 2016/6/21.
             */
            public static class Test {
                public static void main(String[] args){
                    System.out.println(Float.MAX_VALUE);
                    System.out.println(Double.MAX_VALUE);
                    System.out.println(Float.MIN_VALUE);
                    System.out.println(Double.MIN_VALUE);
                    System.out.println(Long.MIN_VALUE);
                    System.out.println(Long.MAX_VALUE);
                    System.out.println(Short.MIN_VALUE);
                    System.out.println(Short.MAX_VALUE);
                    System.out.println(Integer.MAX_VALUE);
                    System.out.println(Integer.MIN_VALUE);
                    System.out.println(Character.MAX_VALUE);
                    System.out.println(Character.MIN_VALUE);


//                    E52 e52 = new E52 ();
//                    e52.hanoi (10, 'A', 'B', 'C');
//                    System.out.println ( e52.counter );


                }
            }
        }
    }
}







