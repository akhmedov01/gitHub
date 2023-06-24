package task5;

public enum Week {

    MONDAY ("ПОНЕДЕЛНИК", "DUSHANBA"),
    TUESDAY ("ВТОРНИК", "SESHANBA"),
    WEDNESDAY ("СРЕДА", "CHORSHANBA"),
    THURSDAY ("ЧЕТВЕРГ", "PAYSHANBA"),
    FRIDAY ("ПЯТНИЦА", "JUMA"),
    SATURDAY ("СУББОТА", "SHANBA"),
    SUNDAY ("ВОСКРЕСЕНЬЕ", "YAKSHANBA");

    private String weekDaysNameRu;
    private String weekDaysNameUz;

    Week() {
    }

    Week(String weekDaysNameRu, String weekDaysNameUz) {
        this.weekDaysNameRu = weekDaysNameRu;
        this.weekDaysNameUz = weekDaysNameUz;
    }

    public String getWeekDaysNameRu() {
        return weekDaysNameRu;
    }


    public String getWeekDaysNameUz() {
        return weekDaysNameUz;
    }


}
