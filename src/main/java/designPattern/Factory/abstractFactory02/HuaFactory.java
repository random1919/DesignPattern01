package designPattern.Factory.abstractFactory02;

public class HuaFactory implements IFactory{
    @Override
    public Phone createPhone() {
        return new HuaPhone();
    }

    @Override
    public Router createRouter() {
        return new HuaRouter();
    }
}
