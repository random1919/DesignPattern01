package designPattern.Factory.simpleFacoty02;

public class FoodFactory {

    public static Food getFood(String type) throws InstantiationException, IllegalAccessException {
        if ("ham".equals(type)){
            return hamburger.class.newInstance();
        }else if ("chip".equals(type)){
            return chips.class.newInstance();
        }else {
            System.out.println("滚出克");
        }
        return null;
    }


}
