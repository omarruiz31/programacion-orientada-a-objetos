public class App {
    public static void main(String[] args) {
        Class poo = new Class("Poo");

        Student s1 = new Student("omar","19");
        Student s2 = new Student("emilio","20" );
        Student s3 = new Student("Mar", "45");
        Student s4 = new Student("Edgar", "23");

        poo.addStudent(s1);
        poo.addStudent(s2);
        poo.addStudent (s3);
        poo.addStudent(s4);

        poo.listStudent();


    }
}
