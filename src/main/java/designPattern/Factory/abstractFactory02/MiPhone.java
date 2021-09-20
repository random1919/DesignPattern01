package designPattern.Factory.abstractFactory02;

public class MiPhone implements Phone{

    public MiPhone(){
        System.out.println("来个小米手机");
    }

    @Override
    public void powerOn() {
        System.out.println("小米开机");
    }

    @Override
    public void shutDown() {
        System.out.println("小米关机");
    }
}
