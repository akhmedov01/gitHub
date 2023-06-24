package task3;

public class Main {
    public static void main(String[] args) {

        for (WindowsUser windowsUsers : WindowsUser.values()) {

            System.out.print(windowsUsers.getNameToUsefulCase() + "\t");

        }

    }
}
