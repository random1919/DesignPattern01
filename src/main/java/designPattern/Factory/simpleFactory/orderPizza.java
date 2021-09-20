package designPattern.Factory.simpleFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class orderPizza {

    public orderPizza(){
        do {
            Pizza pizza = null;
            String pizzaType = getType();
            if ("greek".equals(pizzaType)){
                pizza = new greekPizza();
                pizza.setName("希腊披萨  ----- ");
            }else if ("cheese".equals(pizzaType)) {
                pizza = new cheesePizza();
                pizza.setName("奶酪披萨  ----- ");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    private String getType(){
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("要什么披萨 : ");
            String s = br.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }


    }

}
