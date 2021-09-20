package qust.Inversion;

public class DependenceInversion1 {


    public static void main(String[] args) {
        HaiXin haiXin = new HaiXin();
        Xiaomi xiaomi = new Xiaomi();
        openAndClose openAndClose = new openAndClose();
        openAndClose.setItv(xiaomi);
        openAndClose.open();

    }
}

interface IopenAndClose{
    void open();
}
interface ITV{
    void play();
}

class HaiXin implements ITV{
    @Override
    public void play() {
        System.out.println("Haixin 开播");
    }
}

class Xiaomi implements ITV{
    @Override
    public void play() {
        System.out.println("Xiaomi 开播");
    }
}


//1.
//class openAndClose implements IopenAndClose{
//    @Override
//    public void open(ITV itv) {
//        itv.play();
//    }
//}


//2.构造
//class openAndClose implements IopenAndClose{
//    ITV itv;
//    openAndClose(ITV itv){
//        this.itv = itv;
//    }
//    @Override
//    public void open() {
//        itv.play();
//    }
//}


//3.
class openAndClose implements IopenAndClose{
    ITV itv;

    public void setItv(ITV itv) {
        this.itv = itv;
    }

    @Override
    public void open() {
        itv.play();
    }
}

