package qust.Segregation;

public class segregation {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());

    }



}

interface Interface01 {
    void opearation1();
}

interface Interface02 {
    void opearation2();
    void opearation3();
}

interface Interface03 {
    void opearation4();
    void opearation5();
}

class B implements Interface01, Interface02 {
    @Override
    public void opearation1() {
        System.out.println("B实现1");
    }

    @Override
    public void opearation2() {
        System.out.println("B实现2");
    }

    @Override
    public void opearation3() {
        System.out.println("B实现3");
    }
}

class A{
    public void depend1(Interface01 i){
        i.opearation1();
    }
    public void depend2(Interface02 i){
        i.opearation2();
        i.opearation3();
    }
}