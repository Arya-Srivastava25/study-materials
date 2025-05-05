package Observer;

import Observable.StockObservable;

public class MobileNotificationObserverImpl implements NotificationObserver{

    String phoneNumber;
    StockObservable stockObservable;

    public MobileNotificationObserverImpl(String phoneNumber, StockObservable stockObservable){
        this.phoneNumber = phoneNumber;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update(){
        sendMail(phoneNumber,"Back in stock");
    }

    public void sendMail(String phoneNumber, String message){
        System.out.println("Message sent to " + phoneNumber);
    }
}
