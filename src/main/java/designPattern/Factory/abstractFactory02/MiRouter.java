package designPattern.Factory.abstractFactory02;

public class MiRouter implements Router{

    public MiRouter(){
        System.out.println("来个小米路由器");
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
