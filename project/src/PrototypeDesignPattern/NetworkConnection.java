package PrototypeDesignPattern;

public class NetworkConnection implements Cloneable{
    String ip;
    String data;


    public String getIp() {
        return ip;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public void setIp(String ip){
        this.ip = ip;
    }

    public void loadData() throws InterruptedException {
        Thread.sleep(5000);
        this.data = "Very important data";
    }

    @Override
    public String toString(){
        return this.ip + " : " + this.data;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
