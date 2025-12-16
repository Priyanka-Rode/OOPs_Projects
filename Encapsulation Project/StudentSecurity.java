//Student Marks Security System

class Student{

	//declare variable
	private String name;
    private int marks;

    //apply getter
    public String getName(){
    	return name;
    }

     public int getMarks(){
     	return marks;
     }

     //apply setter
     public void setName(String name){
        this.name = name;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }


}

public class StudentSecurity {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setName("Priyanka");
		s1.setMarks(100);

		System.out.println("Student name is : "+s1.getName());
		System.out.println("Student marks is : " +s1.getMarks());

	}
	
}