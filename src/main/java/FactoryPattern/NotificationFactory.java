package FactoryPattern;

public class NotificationFactory {
    public Notification getNotification(String notifyType){
        switch(NotificationEnum.parseEnum(notifyType)){
            case EMAIL:
                return new Email();
            case SMS:
                return new SMS();
            default:
                return null;
        }
    }
}
