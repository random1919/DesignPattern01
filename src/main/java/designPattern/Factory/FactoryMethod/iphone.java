package designPattern.Factory.FactoryMethod;

public class iphone implements Phone{

    public iphone(){
        System.out.println("来个苹果");
    }

    @Override
    public void sendMsg() {
        System.out.println("苹果发短信");
    }

    @Override
    public void call() {
        System.out.println("苹果打电话");
    }
}
