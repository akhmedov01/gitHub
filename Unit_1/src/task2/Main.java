package task2;

public class Main {

    public static void main(String[] args) {

        Location east = Location.EAST;
        Location west = Location.WEST;
        
        System.out.println(east.name());
        System.out.println(west.name());

        System.out.println("\n============== All Locations ============\n");

        for (Location location : Location.values()) {

            System.out.println(location);
            
        }



    }
}
