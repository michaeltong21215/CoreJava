package Enum;

public enum WeekEnum {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private String dayOfWeek;

    public static WeekEnum parseEnum(String newDay) {
        for(WeekEnum enumVal: WeekEnum.values()){
            if(enumVal.getDayOfWeek().equals(newDay)){
                return enumVal;
            }
        }
        return null;
    }

    WeekEnum(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
