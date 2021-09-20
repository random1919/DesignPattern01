package qust.Liskov;

public class liskov {

    public static void main(String[] args) {
        B b = new B();
        int i = b.fun3(10, 8);
        System.out.println(i);
    }





}


class base{

}

class A extends base{
    public int fun1(int a,int b){
        return a-b;
    }
}

class B extends base{

    private A A01 = new A();

    public int fun1(int a,int b){
        return a+b;
    }

    public int fun2(int a,int b){
        return fun1(a, b)+9;
    }

    public int fun3(int a,int b){
        return A01.fun1(a,b)+10;
    }
}