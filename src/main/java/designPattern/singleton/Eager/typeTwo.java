package designPattern.singleton.Eager;

public class typeTwo {

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }


}

class Singleton2{

    private Singleton2(){

    }

    private static Singleton2 singleton2;

    static {
        singleton2 = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return singleton2;
    }

}