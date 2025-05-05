package DecoratorDesignPattern;

import DecoratorDesignPattern.BasePizzaPackage.BasePizza;
import DecoratorDesignPattern.BasePizzaPackage.PlainBasePizza;
import DecoratorDesignPattern.ToppingsPackage.Corn;
import DecoratorDesignPattern.ToppingsPackage.ExtraCheese;
import DecoratorDesignPattern.ToppingsPackage.Olive;

public class Main {
    public static void main(String[] args){
        BasePizza pizza = new Olive(new Corn(new ExtraCheese(new PlainBasePizza())));

        System.out.println("Cost : " + pizza.cost());
    }
}
