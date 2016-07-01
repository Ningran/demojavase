package cn.edu.tsinghua.training.javase.classroom;

/**
 * Created by Administrator on 2016/6/30.
 */
public class CallByValue {
    public static void main(String[] args) {
        Customer c1 = new Customer("Justin");
        some(c1);
        System.out.println(c1.name);

        Customer c2 = new Customer("Justin");
        other(c2);
        System.out.println(c2.name);
    }

    static void some(Customer c){
        c.name = "Jhon";
    }
    static void other(Customer c){
        c = new Customer("Bill");
    }
}
class Customer{
    String name;
    Customer(String name){
        this.name = name;
    }
}
