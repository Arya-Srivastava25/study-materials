

import java.util.List;

public class WSObservableImpl implements WSObservable {

    List<DisplayObserver> deviceList;
    int temperature;

    @Override
    public void add(DisplayObserver deviceObserver) {
        deviceList.add(deviceObserver);
    }

    @Override
    public void delete(DisplayObserver deviceObserver) {
        deviceList.remove(deviceObserver);
    }

    @Override
    public void send() {
        for(DisplayObserver deviceObserver : deviceList)
            deviceObserver.update();
    }

    @Override
    public void setTemperature(int newTemperature) {
        temperature = newTemperature;
        send();
    }

    @Override
    public int getTemperature() {
        return temperature;
    }
}
