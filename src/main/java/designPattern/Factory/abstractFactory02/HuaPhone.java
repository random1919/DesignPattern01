package designPattern.Factory.abstractFactory02;

public class HuaPhone implements Phone{

    public HuaPhone(){
        System.out.println("来个华为手机");
    }

    @Override
    public void powerOn() {
        System.out.println("华为开机");
    }

    @Override
    public void shutDown() {
        System.out.println("华为关机");
    }
}
