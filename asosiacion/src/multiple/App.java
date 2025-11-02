package multiple;
public class App {
    public static void main(String[] args) {
        Client omar = new Client("Omar");
        Client diego =  new Client("Diego");

        Order o1 = new Order("2025-05-20");
        Order o2 = new Order("2025-10-31");
        Order o3 = new Order("2023-10-20");

        o1.setClient(diego);
        o2.setClient(omar);
        o3.setClient(diego);

        omar.addOrder(o2);
        diego.addOrder(o1);
        diego.addOrder(o3);

        System.out.println("Ordernes de omar: ");
        omar.showOrders();

        System.out.println("Ordenes de Diego");
        diego.showOrders();
    }
}
