package designPattern.builder;

public abstract class Builder {

    Computer computer = new Computer();

    abstract void buildCpu();
    abstract void buildPrice();
    abstract void buildBrand();

    public Computer createComputer(){
        return computer;
    }
}
