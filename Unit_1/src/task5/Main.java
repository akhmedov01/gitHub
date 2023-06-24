package task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter Week Day Number (1-7): ");
        int dayNumber = keyboard.nextInt();

        System.out.print("What Language Do You Need ( ENG/RU/UZ )?: ");
        String dayName = keyboard.next();

        if (dayName.equalsIgnoreCase("ENG")) {
            switch (dayNumber) {
                case 1:
                    System.out.println(Week.values()[0].name());
                    break;
                case 2:
                    System.out.println(Week.values()[1].name());
                    break;
                case 3:
                    System.out.println(Week.values()[2].name());
                    break;
                case 4:
                    System.out.println(Week.values()[3].name());
                    break;
                case 5:
                    System.out.println(Week.values()[4].name());
                    break;
                case 6:
                    System.out.println(Week.values()[5].name());
                    break;
                case 7:
                    System.out.println(Week.values()[6].name());
                    break;
            }
        }


        else if (dayName.equalsIgnoreCase("RU")) {
            switch (dayNumber) {
                case 1:
                    System.out.println(Week.values()[0].getWeekDaysNameRu());
                    break;
                case 2:
                    System.out.println(Week.values()[1].getWeekDaysNameRu());
                    break;
                case 3:
                    System.out.println(Week.values()[2].getWeekDaysNameRu());
                    break;
                case 4:
                    System.out.println(Week.values()[3].getWeekDaysNameRu());
                    break;
                case 5:
                    System.out.println(Week.values()[4].getWeekDaysNameRu());
                    break;
                case 6:
                    System.out.println(Week.values()[5].getWeekDaysNameRu());
                    break;
                case 7:
                    System.out.println(Week.values()[6].getWeekDaysNameRu());
                    break;
            }
        }


        else if (dayName.equalsIgnoreCase("UZ")) {
            switch (dayNumber) {
                case 1:
                    System.out.println(Week.values()[0].getWeekDaysNameUz());
                    break;
                case 2:
                    System.out.println(Week.values()[1].getWeekDaysNameUz());
                    break;
                case 3:
                    System.out.println(Week.values()[2].getWeekDaysNameUz());
                    break;
                case 4:
                    System.out.println(Week.values()[3].getWeekDaysNameUz());
                    break;
                case 5:
                    System.out.println(Week.values()[4].getWeekDaysNameUz());
                    break;
                case 6:
                    System.out.println(Week.values()[5].getWeekDaysNameUz());
                    break;
                case 7:
                    System.out.println(Week.values()[6].getWeekDaysNameUz());
                    break;
            }
        }




    }
}
