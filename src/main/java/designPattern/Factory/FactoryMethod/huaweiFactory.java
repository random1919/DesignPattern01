package designPattern.Factory.FactoryMethod;

public class huaweiFactory implements IphoneFactory{

    @Override
    public Phone createPhone() {
        return new huawei();
    }
}
