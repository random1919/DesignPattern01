package designPattern.singleton.Lazy;

//静态内部类
public class typeThree {

    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}


class Singleton3{

    private Singleton3(){}

    private static class SingletonInstance{
        private static final Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance(){
        return SingletonInstance.instance;
    }

}