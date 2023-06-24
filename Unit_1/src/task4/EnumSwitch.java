package task4;

public class EnumSwitch {

    Month month;

    public EnumSwitch(Month month) {
        this.month = month;
    }

    public void aboutMonth () {
        switch (month) {

            case JANUARY: case DECEMBER: case FEBRUARY:
                System.out.println("Winter");
                break;
            case MARCH: case MAY: case APRIL:
                System.out.println("Spring");
                break;
            case JUNE: case JULY: case AUGUST:
                System.out.println("Summer");
                break;
            case SEPTEMBER: case OCTOBER: case NOVEMBER:
                System.out.println("Autumn");
                break;
        }
    }
}
