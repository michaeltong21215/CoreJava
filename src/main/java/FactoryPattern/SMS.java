package FactoryPattern;

public class SMS implements Notification{
    @Override
    public void alert() {
        System.out.println("Sending text message!");
    }
}
