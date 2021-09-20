package designPattern.Prototype.DeepCopyTwo;

public class Client {

    public static void main(String[] args) throws Exception {
        DeepCopyPrototype d1 = new DeepCopyPrototype();
        DeepCopyTarget deepCopyTarget = new DeepCopyTarget("张三","张三类");
        d1.setName("李四");
        d1.setDeepCopyTarget(deepCopyTarget);


        //1.手动重写clone
//        DeepCopyPrototype p1 = (DeepCopyPrototype) d1.clone();
//        DeepCopyPrototype p2 = (DeepCopyPrototype) d1.clone();
//        System.out.println(d1);
//        System.out.println(p1);
//        System.out.println(p2);


        //2.利用序列化
        DeepCopyPrototype t1 = (DeepCopyPrototype) d1.deepClone();
        DeepCopyPrototype t2 = (DeepCopyPrototype) d1.deepClone();
        System.out.println(d1);
        System.out.println(t1);
        System.out.println(t2);

    }


}
