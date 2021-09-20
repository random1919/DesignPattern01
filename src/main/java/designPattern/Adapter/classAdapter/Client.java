package designPattern.Adapter.classAdapter;

public class Client {

    public static void main(String[] args) {
        new Phone().charge(new VoltageChange());
    }



}
