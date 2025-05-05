package DecoratorDesignPattern.ToppingsPackage;

import DecoratorDesignPattern.BasePizzaPackage.BasePizza;

public class Olive extends ToppingsDecorator{

    BasePizza basePizza;

    public Olive(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        return this.basePizza.cost() + 80;
    }
}
