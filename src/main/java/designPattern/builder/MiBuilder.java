package designPattern.builder;

public class MiBuilder extends Builder{

    @Override
    void buildCpu() {
       computer.setCpu("小米CPU");
    }

    @Override
    void buildPrice() {
        computer.setPrice(3000);
    }

    @Override
    void buildBrand() {
        computer.setBrand("狗都不买小米");
    }


}
