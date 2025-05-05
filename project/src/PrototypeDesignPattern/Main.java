package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        NetworkConnection networkConnection = new NetworkConnection();
        networkConnection.setIp("19.345.98.1");
        networkConnection.loadData();

        System.out.println(networkConnection);

        NetworkConnection networkConnection1 = null;

        try {
             networkConnection1 = (NetworkConnection) networkConnection.clone();
             networkConnection1.setIp("1.2.3.4");
        }
        catch (CloneNotSupportedException ex){
            ex.printStackTrace();
        }

        System.out.println(networkConnection1);
    }
}
