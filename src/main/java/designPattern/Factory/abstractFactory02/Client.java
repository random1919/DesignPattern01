package designPattern.Factory.abstractFactory02;

public class Client {

    public static void main(String[] args) {
        MiFactory miFactory = new MiFactory();
        miFactory.createPhone();
        miFactory.createRouter();

        HuaFactory huaFactory = new HuaFactory();
        huaFactory.createPhone();
        huaFactory.createRouter();
    }


}
