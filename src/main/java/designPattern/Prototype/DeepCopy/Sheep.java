package designPattern.Prototype.DeepCopy;

public class Sheep implements Cloneable{
    String name;
    int age;
    wolf friend;

    public wolf getFriend() {
        return friend;
    }

    public void setFriend(wolf friend) {
        this.friend = friend;
    }

    public Sheep(){}

    public Sheep(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Sheep(String name, int age, wolf wolf){
        this.name = name;
        this.age = age;
        this.friend = wolf;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friend=" + friend.hashCode() +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = (Sheep)super.clone();
        //实现引用类型成员的深拷贝
        sheep.setFriend((wolf) sheep.getFriend().clone());
        return sheep;
    }
}
