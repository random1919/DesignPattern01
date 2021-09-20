package designPattern.Adapter.classAdapter;

public class Phone {

    public void charge(VoltageChange voltageChange){
        int output = voltageChange.change5V();
        if (output == 5){
            System.out.println("已适配   当前电压--5V   开冲");
        }else {
            System.out.println("滚蛋吧");
        }
    }


}
