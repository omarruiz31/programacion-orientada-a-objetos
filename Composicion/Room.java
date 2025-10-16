public class Room {

    private String name;
    private double area;

    public  Room(String nombre ,double area){
        this.name = nombre;
        this.area = area;
    }

    public String getNombre(){
        return name;
    }

    public double getArea(){
        return area;
    }


}