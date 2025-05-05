package NotifyMeObserverDesignPattern.Observable;

import NotifyMeObserverDesignPattern.Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver notificationObserver);
    public void remove(NotificationObserver notificationObserver);
    public void notifyUsers();
    public void setStock(int stock);
    public int getStock();
}
