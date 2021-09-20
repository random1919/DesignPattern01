package designPattern.Factory.simpleFactory;

public class cheesePizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨准备材料");
    }


}
