public interface WSObservable {
    public void add(DisplayObserver deviceObserver);

    public void delete(DisplayObserver deviceObserver);

    public void send();

    public void setTemperature(int temperature);

    public int getTemperature();
}
