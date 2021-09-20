package designPattern.Prototype.DeepCopyTwo;

import java.io.Serializable;

public class DeepCopyTarget implements Serializable,Cloneable {

    private static final long serialVersionUID = 1L;

    String cloneName;
    String cloneClass;

    public String getCloneName() {
        return cloneName;
    }

    public void setCloneName(String cloneName) {
        this.cloneName = cloneName;
    }

    public String getCloneClass() {
        return cloneClass;
    }

    public void setCloneClass(String cloneClass) {
        this.cloneClass = cloneClass;
    }

    public DeepCopyTarget(String cloneName , String cloneClass){
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "DeepCopyTarget{" +
                "cloneName='" + cloneName + '\'' +
                ", cloneClass='" + cloneClass + '\'' +
                '}';
    }
}
