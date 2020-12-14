package FactoryPattern;

public enum NotificationEnum {
    EMAIL("Email"),
    SMS("SMS");

    private String notificationType;

    public static NotificationEnum parseEnum(String notificationType) {
        for(NotificationEnum enumVal: NotificationEnum.values()){
            if(enumVal.getNotificationType().equals(notificationType)){
                return enumVal;
            }
        }
        return null;
    }

    NotificationEnum(String notificationType) {
        this.notificationType = notificationType;
    }

    public String getNotificationType() {
        return notificationType;
    }

    public void setNotificationType(String notificationType) {
        this.notificationType = notificationType;
    }
}
