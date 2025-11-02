package multiple;
import java.util.ArrayList;

public class Client {
    private String name;
    
    private ArrayList<Order> orders = new ArrayList<>(); 

    public Client(String name){
        this.name = name;
    }

    
    public void addOrder(Order o){
        orders.add(o);
    }

    public void showOrders(){
        for(Order order: orders){ 
            System.out.println("Fecha de la Orden: " + order.getDate());
            
            System.out.println("Cliente asociado (obtenido de la orden): " + order.getClient());
            System.out.println("---");
        }
    }

    public String getName(){
        return name;
    }
}