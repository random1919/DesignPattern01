package qust.LKP;

import java.awt.image.Kernel;

public class lkp01 {

    public static void main(String[] args) {
        Father father = new Father();
        Person person = new Person();
        person.setName("z3");
        father.command(person);
    }






}

class Person{
    String name;
    public void setName(String name) {
        this.name = name;
    }
}

class Father{
    private coreMember coreMember;
    public void command(Person p){
        coreMember = new coreMember();
        coreMember.toKill(p);
     }
}

class coreMember{
    private killer killer;
    public void toKill(Person person){
        killer = new killer();
        killer.kill(person);
    }
}

class killer{
    public void kill(Person person){
        System.out.println(person.name + "被杀了");
    }

}
