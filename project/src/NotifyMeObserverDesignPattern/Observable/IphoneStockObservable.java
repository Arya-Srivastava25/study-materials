package NotifyMeObserverDesignPattern.Observable;

import NotifyMeObserverDesignPattern.Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable{

    int stock = 0;

    List<NotificationObserver> notificationObserverList = new ArrayList<>();

    @Override
    public void add(NotificationObserver notificationObserver) {
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver) {
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifyUsers() {
        for(NotificationObserver notificationObserver : notificationObserverList)
            notificationObserver.update();
    }

    @Override
    public void setStock(int stock) {
        if(this.stock == 0)
            notifyUsers();
        this.stock += stock;
    }

    @Override
    public int getStock() {
        return stock;
    }
}
