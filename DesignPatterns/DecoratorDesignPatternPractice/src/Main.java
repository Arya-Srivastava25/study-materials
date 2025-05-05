public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new Paneer(new ExtraCheese(new Margherita()));

        System.out.println(pizza.cost());
    }
}