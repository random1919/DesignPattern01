package designPattern.singleton.Eager;

public class typeOne {

    public static void main(String[] args) {
       Singleton s1 = Singleton.getInstance();
       Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }


}


class Singleton{
    //1.私有化构造方法
    private Singleton(){
    }

    //2.new一个常量
    private final static Singleton singleton = new Singleton();

    //3.提供对外方法
    public static Singleton getInstance(){
        return singleton;
    }

}