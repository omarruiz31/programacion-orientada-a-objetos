public class App {
    public static void main(String[] args) {
        
    House casa = new House("Petrolera");
    casa.addRoom("Comedor",15);
    casa.addRoom("cocina",10);
    casa.addRoom("Baño",20);
    casa.addRoom("Cuarto", 25);

    casa.showRooms();
    }
}
