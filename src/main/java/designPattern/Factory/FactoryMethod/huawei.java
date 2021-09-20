package designPattern.Factory.FactoryMethod;

public class huawei implements Phone{

    public huawei(){
        System.out.println("来个华为");
    }

    @Override
    public void sendMsg() {
        System.out.println("华为发短信");
    }

    @Override
    public void call() {
        System.out.println("华为打电话");
    }
}
