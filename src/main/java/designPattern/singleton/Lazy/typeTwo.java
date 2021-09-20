package designPattern.singleton.Lazy;


//double check  推荐！！！！！！！！！！！！！！！
public class typeTwo {

    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }



}

class Singleton2 {
    //volatile防止重排序
    private static volatile Singleton2 instance;

    private Singleton2() {
    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            synchronized (Singleton2.class) {
                if (instance == null){
                    //不判空可能new多个实例
                    instance = new Singleton2();
                }
            }
        }
        return instance;
    }
}
