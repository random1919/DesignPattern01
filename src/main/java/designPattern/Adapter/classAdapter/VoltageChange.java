package designPattern.Adapter.classAdapter;

public class VoltageChange implements IVoltageChange{

    private Voltage220 voltage220;

    @Override
    public int change5V() {
        voltage220 = new Voltage220();
        int output = voltage220.output();
        return output / 44;
    }

}
