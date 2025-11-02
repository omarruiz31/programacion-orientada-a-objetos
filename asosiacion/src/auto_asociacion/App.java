package auto_asociacion;
public class App {

    public static void main(String[] args) {
        Employee omar = new Employee("omar");
        Employee ian = new Employee("Ian");
        Employee Pam = new Employee("pam");

        omar.addSubordinate(Pam);
        omar.addSubordinate(ian);

        omar.showTeam();

    }
}
