package designPattern.Factory.FactoryMethod;

public class appleFactory implements IphoneFactory{


    @Override
    public Phone createPhone() {
        return new iphone();
    }
}
