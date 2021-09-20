package designPattern.Factory.simpleFactory;

public class greekPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备材料");
    }
}
