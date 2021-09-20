package designPattern.Adapter.interfaceAdapter;

public class Client {

    public static void main(String[] args) {
       ABT abt = new ABT(){
            @Override
            public void m2() {
                System.out.println("使用m2");
            }
        };
        abt.m2();
    }

}
