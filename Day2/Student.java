package TrainingDaytwo;

public class Student 
{
	int studentId;
	char studentType;
	String firstname;
	String lastname;
    String studentName;
		Student()
		{
			studentId =550;
		}

		Student(int id,char sType,String firstname,String lastname)
		{
			this.studentId=id;
			studentType=sType;
			this.firstname = firstname;
			this.lastname = lastname;
			this.studentName = firstname+lastname;
		
		}
		public void SetStudentName(String firstname, String lastName)
		{
			this.firstname=firstname;
			this.lastname=lastname;
			studentName=firstname+lastname;
		}
		public String getStudentName()
		{
			return studentName;
			
		}
		void displayDetails(Student obj)
		{   
			//String studentName = firstname+lastname; 
			System.out.println("Student details");
			System.out.println("Student Type "  +studentType);
			System.out.println("Student firstname "  +obj.firstname);
			System.out.println("Student lastname "  +obj.lastname);
			System.out.println("Student first and last name "  +obj.studentName);
		
		}
		public static void main(String[] args)
		{
			Student studentOne = new Student(10,'D',"Bony","Thomas");
			studentOne.displayDetails(studentOne);
			Student studentTwo = new Student(20,'H',"Denil","Bose");
			studentTwo.displayDetails(studentTwo);
		}
}
