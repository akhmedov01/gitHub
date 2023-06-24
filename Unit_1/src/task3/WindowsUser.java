package task3;

public enum WindowsUser {

    USER ("User"),
    ADMIN ("Admin"),
    GUEST ("Guest");

    private String nameToUsefulCase;

    WindowsUser(String nameToUsefulCase) {
        this.nameToUsefulCase = nameToUsefulCase;
    }

    public String getNameToUsefulCase() {
        return nameToUsefulCase;
    }

    public void setNameToUsefulCase(String nameToUsefulCase) {
        this.nameToUsefulCase = nameToUsefulCase;
    }
}
