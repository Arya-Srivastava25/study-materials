package NotifyMeObserverDesignPattern.Observer;

import NotifyMeObserverDesignPattern.Observable.StockObservable;

public class PhoneNotificationObserver implements NotificationObserver{
    StockObservable stockObservable;
    String phoneNumber;

    public PhoneNotificationObserver(StockObservable stockObservable, String phoneNumber){
        this.stockObservable = stockObservable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(){
        sendMessage(phoneNumber,"Back In Stock");
    }

    public void sendMessage(String phoneNumber, String message){
        System.out.println("Message send to : " + phoneNumber + " with message : " + message);
    }
}
