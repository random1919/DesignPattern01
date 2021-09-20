package designPattern.Prototype.DeepCopyTwo;

import java.io.*;

public class DeepCopyPrototype implements Serializable,Cloneable {
    String name;
    public DeepCopyTarget deepCopyTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCopyTarget getDeepCopyTarget() {
        return deepCopyTarget;
    }

    public void setDeepCopyTarget(DeepCopyTarget deepCopyTarget) {
        this.deepCopyTarget = deepCopyTarget;
    }

    public DeepCopyPrototype() {
    }


    //1.手动深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopyPrototype deepCopyPrototype = (DeepCopyPrototype) super.clone();
        deepCopyPrototype.deepCopyTarget = (DeepCopyTarget) deepCopyTarget.clone();
        return deepCopyPrototype;
    }


    //2.序列化
    public Object deepClone() throws Exception {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;

        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        //序列化  对象转字节序列


            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //将当前对象以对象流的方式输出
            oos.writeObject(this);

            //反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepCopyPrototype deepCopyPrototype = (DeepCopyPrototype) ois.readObject();

            bos.close();
            oos.close();
            bis.close();
            ois.close();

            return deepCopyPrototype;
    }




    @Override
    public String toString() {
        return "DeepCopyPrototype{" +
                "name='" + name + '\'' +
                ", deepCopyTarget=" + deepCopyTarget + "hashCode" + deepCopyTarget.hashCode() +
                '}';
    }
}
