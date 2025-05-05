public class TVDisplayObserver implements DisplayObserver{

    WSObservable wsObservable;

    TVDisplayObserver(WSObservable wsObservable){
        this.wsObservable = wsObservable;
    }
    @Override
    public void update(){
        wsObservable.getTemperature();
    }
}
