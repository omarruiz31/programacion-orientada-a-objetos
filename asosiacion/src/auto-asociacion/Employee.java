import java.util.ArrayList;

public class Employee {
    private String name;
    private ArrayList<Employee> Subordinates = new ArrayList<>();

    public Employee(String name){
        this.name = name;
    }

    public void addSubordinate(Employee Subordinates){
        Subordinate.add(Subordinates);
    }

    public showTeam(){
        for (Employee it : Subordinates) {
            System.out.println(it);
        }
    }
}