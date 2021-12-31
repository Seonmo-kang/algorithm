import java.util.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		while(testCases>0){
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();
			
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			
			testCases--;
		}
		in.close();
        /* 
            Using sort method with Comparator class override compare() method.
            sort(new Comparator<Student>(){
                @Override
                public int compare(Student s1, Student s2){
                    if (s1.getCgpa() > s2.getCgpa()){   - ( Reversed )
                        return -1;                        if the first object paramether is bigger than second
                                                          It must return -1 ( because it is reversed )
                    }                                   - if the first parameter is smaller than second
                }                                         It must return 1;
            })
        */
        studentList.sort(new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                if(s1.getCgpa() == s2.getCgpa()){
                    if((s1.getFname().compareTo(s2.getFname()))==0){
                        return s1.getId()-s2.getId();
                    }else{
                        return s1.getFname().compareTo(s2.getFname());
                    }
                }else if(s1.getCgpa() > s2.getCgpa()){
                    return -1;
                }else{
                    return 1;
                }
            }
        });
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



