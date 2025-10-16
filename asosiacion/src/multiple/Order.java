public class Order {
    private String date;
    private Client client;

    public Order(String date){
        this.date = date;
    }

    public setClient(Client c){
        this.client = c;
    }

    public String getClient(){
        return client.getName();

    }

    public String getDate(){
        return this.date;
    }

    public process(){
        System.out.println("Procesando");
    }




}
