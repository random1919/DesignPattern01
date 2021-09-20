package designPattern.Factory.abstractFactory02;

public class HuaRouter implements Router{

    public HuaRouter(){
        System.out.println("来个华为路由器");
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
