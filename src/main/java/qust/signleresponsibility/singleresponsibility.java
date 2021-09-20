package qust.signleresponsibility;

public class singleresponsibility{

    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");

        AirVehicl airVehicl = new AirVehicl();
        airVehicl.run("飞机");

        WaterVehicl waterVehicl = new WaterVehicl();
        waterVehicl.run("潜艇");
    }

}

class RoadVehicle{
    public void run(String vehicle){
        System.out.println(vehicle + "在公路跑");
    }
}

class AirVehicl{
    public void run(String vehicle){
        System.out.println(vehicle + "在天上飞");
    }
}

class WaterVehicl{
    public void run(String vehicle){
        System.out.println(vehicle + "在水里游");
    }
}