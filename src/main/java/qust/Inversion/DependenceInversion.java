package qust.Inversion;

public class DependenceInversion {

    public static void main(String[] args) {
        Person person = new Person();
        person.getInfo(new Email());
        person.getInfo(new Wechat());
    }
}

interface Receiver{
     void getInfo();
}

class Email implements Receiver{
    @Override
    public void getInfo() {
        System.out.println("接受到Email消息");
    }
}

class Wechat implements Receiver{
    @Override
    public void getInfo() {
        System.out.println("接收到Wechat消息");
    }
}

class Person{
    public void getInfo(Receiver receiver){
        receiver.getInfo();
    }
}