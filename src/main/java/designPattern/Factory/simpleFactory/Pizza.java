package designPattern.Factory.simpleFactory;

public abstract class Pizza {

    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void bake(){
        System.out.println(name + "烘焙披萨");
    }

    public void cut(){
        System.out.println(name + "分割披萨");
    }

    public void box(){
        System.out.println(name + "打包披萨");
    }
}
