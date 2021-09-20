package designPattern.builder;

public class ComputerDirector {

    public Computer createComputer(Builder builder){
        Computer computer;
        builder.buildBrand();
        builder.buildCpu();
        builder.buildPrice();
        computer = builder.createComputer();
        return computer;
    }



}
