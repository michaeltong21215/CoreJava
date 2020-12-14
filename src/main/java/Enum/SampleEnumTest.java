package Enum;

public class SampleEnumTest {

    public static void main(String[] args) {

        String day = "Saturday";
        switch(WeekEnum.parseEnum(day)){
            case SATURDAY:

                System.out.println("It is saturday");
                break;
            default:
                System.out.println("It is just a regular day");
        }
    }
}
/*
Next session:
- Factory pattern
- New Project on Parsing different kind of documents

 */