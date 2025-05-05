import Services.Invoice;
import Services.Order;
import Services.Payment;

public class OrderFacade {
    Invoice invoice;
    Order order;
    Payment payment;

    OrderFacade(Invoice invoice, Order order, Payment payment){
        this.invoice = invoice;
        this.order = order;
        this.payment = payment;
    }

    public void createOrder(){
        order.receiveOrder();
        payment.makePayment();
        invoice.generateInvoice();
    }
}
