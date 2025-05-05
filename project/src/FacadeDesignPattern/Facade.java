package FacadeDesignPattern;

public class Facade {

    Order order;
    Payment payment;
    Invoice invoice;

    public Facade(Order order,Payment payment, Invoice invoice){
        this.order = order;
        this.payment = payment;
        this.invoice = invoice;
    }
    public void createOrder(){
        order.orderReceived();
        payment.paymentCompleted();
        invoice.invoiceGenerated();
    }
}
