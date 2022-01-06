import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;
/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private int id;
    private String name;
    private double cgpa;
    
    Student(int id, String name, double cgpa){
        super();
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    int getID(){
        return id;
    }
    String getName(){
        return name;
    }
    double getCGPA(){
        return cgpa;
    }
}
class Priorities{
    public List<Student> getStudents(List<String> events){
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
        List<Student> studentGrp = new ArrayList<Student>();
        for (String e : events){
            Scanner sc = new Scanner(e);
            String oper = sc.next();
            if(oper.equals("ENTER")){
                String name = sc.next();
                float cgpa = sc.nextFloat();
                int id = sc.nextInt();
                Student student = new Student(id,name,cgpa);
                pq.add(student);
            }else if(oper.equals("SERVED")){
                    pq.poll();
            }
            sc.close();        
        }
        while(!pq.isEmpty()){
            studentGrp.add(pq.poll());
        }
        return studentGrp;
    }
}

public class Java_PriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}