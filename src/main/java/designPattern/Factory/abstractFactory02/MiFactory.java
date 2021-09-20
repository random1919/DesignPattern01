package designPattern.Factory.abstractFactory02;

public class MiFactory implements IFactory{

    @Override
    public Phone createPhone() {
        return new MiPhone();
    }

    @Override
    public Router createRouter() {
       return new MiRouter();
    }
}
