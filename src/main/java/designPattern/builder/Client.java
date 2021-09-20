package designPattern.builder;

public class Client {

    public static void main(String[] args) {
        ComputerDirector computerDirector = new ComputerDirector();
        Computer computer1 = computerDirector.createComputer(new MiBuilder());
        Computer computer2 = computerDirector.createComputer(new HuaBuilder());
        Computer computer3 = computerDirector.createComputer(new levBuilder());


        System.out.println(computer1);
        System.out.println(computer2);
        System.out.println(computer3);

    }





}
