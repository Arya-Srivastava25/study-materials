import Services.Invoice;
import Services.Order;
import Services.Payment;

public class Main {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade(new Invoice(), new Order(), new Payment());
        orderFacade.createOrder();
    }
}