package designPattern.builder;

public class levBuilder extends Builder{

    @Override
    void buildCpu() {
        computer.setCpu("i5");
    }

    @Override
    void buildPrice() {
        computer.setPrice(4999);
    }

    @Override
    void buildBrand() {
        computer.setBrand("美帝良心想");
    }
}
