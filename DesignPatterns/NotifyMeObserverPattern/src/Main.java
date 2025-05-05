import Observable.PhoneStockObservableImpl;
import Observable.StockObservable;
import Observer.EmailNotificationObserverImpl;
import Observer.MobileNotificationObserverImpl;
import Observer.NotificationObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable stockObservable = new PhoneStockObservableImpl();

        NotificationObserver notificationObserver1 = new MobileNotificationObserverImpl("9876543210", stockObservable);
        NotificationObserver notificationObserver2 = new EmailNotificationObserverImpl("arya@gmail.com",stockObservable);

        stockObservable.add(notificationObserver1);
        stockObservable.add(notificationObserver2);
        stockObservable.setStock(10);
    }
}