package designPattern.Prototype.DeepCopy;

public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep();
        wolf wolf1 = new wolf("ηδΊ");
        sheep1.setName("ζε");
        sheep1.setAge(3);
        sheep1.setFriend(wolf1);


        try {
            Sheep clone1 =(Sheep) sheep1.clone();
            Sheep clone2 =(Sheep) sheep1.clone();

            System.out.println(clone1.getFriend().hashCode());
            System.out.println(clone2.getFriend().hashCode());

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }



}
