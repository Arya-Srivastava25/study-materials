package NotifyMeObserverDesignPattern.Observer;

import NotifyMeObserverDesignPattern.Observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{
    StockObservable stockObservable;
    String email;
    public EmailNotificationObserver(StockObservable stockObservable, String email){
        this.stockObservable = stockObservable;
        this.email = email;
    }
    @Override
    public void update(){
        sendMain(email,"Back In Stock");
    }
    public void sendMain(String email, String message){
        System.out.println("Email send to : "+ email + " with message : " + message);
    }
}
