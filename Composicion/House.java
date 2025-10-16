import java.util.ArrayList;

public class House {
    private String address;
    private ArrayList<Room> rooms;


    public House(String address){
        this.address = address;
        this.rooms = new ArrayList<>();
    }

    public void addRoom(String name, double area){
        Room room = new Room(name,area);
        rooms.add(room);
    }

    public void showRooms(){
        for (Room room : rooms) {
            System.out.println(room.getNombre());
            
        }
    }


}
