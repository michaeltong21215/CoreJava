package FactoryPattern;

public class NotificationFactoryClient {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();
        Notification SMS = factory.getNotification("SMS");
        Notification email = factory.getNotification("Email");
        SMS.alert();
        email.alert();
    }
}
