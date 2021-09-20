package qust.ocp;

public class ocp1 {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drewShape(new Circle());
        graphicEditor.drewShape(new Rectangle());

    }

}


class GraphicEditor{

    public void drewShape(Shape shape){
        shape.drew();
    }


}

interface Shape{
    void drew();
}

class Circle implements Shape{

    @Override
    public void drew() {
        System.out.println("画了个圆");
    }
}


class Rectangle implements Shape{
    @Override
    public void drew() {
        System.out.println("画了个方");
    }
}


