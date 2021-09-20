package designPattern.builder;

public class HuaBuilder extends Builder{

    @Override
    void buildCpu() {
        computer.setCpu("麒麟980");
    }

    @Override
    void buildPrice() {
        computer.setPrice(4999);
    }

    @Override
    void buildBrand() {
        computer.setBrand("i'm chinese");
    }



}
