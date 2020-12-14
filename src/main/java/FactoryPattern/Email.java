package FactoryPattern;

public class Email implements Notification{
    @Override
    public void alert() {
        System.out.println("Sending email message!");
    }
}
