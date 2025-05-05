
public class MobileDisplayObserver implements DisplayObserver{

    WSObservable wsObservable;
    MobileDisplayObserver(WSObservable wsObservable){
        this.wsObservable = wsObservable;
    }
    @Override
    public void update() {
        wsObservable.getTemperature();
    }
}
