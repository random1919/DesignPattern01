package designPattern.Factory.simpleFacoty02;

public class hamburger implements Food{

    @Override
    public void get() {
        System.out.println("给我一份汉堡");
    }
}
