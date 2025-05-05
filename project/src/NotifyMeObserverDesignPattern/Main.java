package NotifyMeObserverDesignPattern;

import NotifyMeObserverDesignPattern.Observable.IphoneStockObservable;
import NotifyMeObserverDesignPattern.Observable.StockObservable;
import NotifyMeObserverDesignPattern.Observer.EmailNotificationObserver;
import NotifyMeObserverDesignPattern.Observer.NotificationObserver;
import NotifyMeObserverDesignPattern.Observer.PhoneNotificationObserver;

public class Main {
    public static void main(String[] args){
        StockObservable stockObservable = new IphoneStockObservable();

        NotificationObserver emailNotificationObserver = new EmailNotificationObserver(stockObservable,"arya@gmail.com");
        NotificationObserver phoneNotificationObserver = new PhoneNotificationObserver(stockObservable,"9876543210");

        stockObservable.add(emailNotificationObserver);
        stockObservable.add(phoneNotificationObserver);

        stockObservable.setStock(10);
    }
}
