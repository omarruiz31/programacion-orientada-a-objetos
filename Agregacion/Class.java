import java.util.ArrayList;

public class Class {

    private String name;
    private ArrayList<Student> students;

    public Class(String name){
        this.name = name;
        this.students = new ArrayList<>();
        
    }

   public void addStudent(Student s){
    students.add(s);
   }
   
   public void listStudent(){
        for(Student s: students){
            System.out.println(s.getName());
        }
    }


}