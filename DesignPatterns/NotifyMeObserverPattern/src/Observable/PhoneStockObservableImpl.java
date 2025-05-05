package Observable;

import Observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class PhoneStockObservableImpl implements StockObservable{

    int stock = 0;
    List<NotificationObserver> notificationObserverList = new ArrayList<>();
    @Override
    public void add(NotificationObserver notificationObserver){
        notificationObserverList.add(notificationObserver);
    }

    @Override
    public void remove(NotificationObserver notificationObserver){
        notificationObserverList.remove(notificationObserver);
    }

    @Override
    public void notifyUsers(){
        for(NotificationObserver notificationObserver : notificationObserverList)
            notificationObserver.update();
    }

    @Override
    public void setStock(int newStock){
        if(stock == 0)
            notifyUsers();
        stock += newStock;
    }

    @Override
    public int getStock(){
        return stock;
    }
}
