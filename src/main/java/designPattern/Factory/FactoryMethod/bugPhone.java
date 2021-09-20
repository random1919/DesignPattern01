package designPattern.Factory.FactoryMethod;

public class bugPhone {

    public static void main(String[] args) {
        IphoneFactory huawei = new huaweiFactory();
        huawei.createPhone();

        IphoneFactory iphone = new appleFactory();
        iphone.createPhone();
    }


}
