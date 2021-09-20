package designPattern.Factory.simpleFacoty02;

public class order {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        Food ham = FoodFactory.getFood("ham");
        ham.get();
    }


}
