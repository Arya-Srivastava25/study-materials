package Observer;

import Observable.StockObservable;

public class EmailNotificationObserverImpl implements NotificationObserver{

    String emailId;
    StockObservable stockObservable;
    public EmailNotificationObserverImpl(String emailId, StockObservable stockObservable){
        this.emailId = emailId;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update(){
        sendMail(emailId, "Back in stock");
    }

    public void sendMail(String emailId, String message){
        System.out.println("Mail sent to : " + emailId);
    }
}
