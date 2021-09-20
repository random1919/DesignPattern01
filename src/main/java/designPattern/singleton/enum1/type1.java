package designPattern.singleton.enum1;

public class type1 {

    public static void main(String[] args) {
        Singleton instance1 = Singleton.instance;
        Singleton instance2 = Singleton.instance;
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }

}



enum Singleton{
    instance;
    public void ok(){
        System.out.println("中~~~");
    }
}