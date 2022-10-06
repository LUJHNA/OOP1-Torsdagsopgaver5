package Task2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        Room r1 = new Room(4, 10, 5);
        Room r2 = new Room(2, 8, 9);
        Room r3 = new Room(5, 5, 5);
        Building b1 = new Building(rooms, 5, 5, true);

        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);

        int numberOfLamps = countLampsInBuilding(b1);
        System.out.println(numberOfLamps);

        boolean floorsVsRooms = isNormal(b1);
        System.out.println(floorsVsRooms);
    }

    static int countLampsInBuilding(Building building) {
        ArrayList<Room> listOfRooms = building.getRooms();
        int result = 0;
        for (Room room : listOfRooms) {
            result = result + room.getNumberOfLamps();
        }
        return result;
    }

    static boolean isNormal(Building b) {
        if (b.getNumberOfFloors() > b.getRooms().size()) {
            return true;
        } else {
            System.out.println("This is an odd building");
            return false;
        }
    }
}


