package TrainingDaytwo;

public class Student 
{
	int studentId;
	char studentType;
	//String firstname;
	//String lastname;
    String studentName;
	//private String firstname;
		Student()
		{
			studentId =550;
		}

		Student(int id,char sType,String firstname,String lastname)
		{
			studentId=id;
			studentType=sType;
			firstname = firstname;
			lastname = lastname;
			this.studentName = firstname+lastname;
		
		}
		public void setstudentId(int id)
		{
			studentId=id;
		}
		public int getstudentId()
		{
			return studentId;
		}
		public void setsType(char ch)
		{
			studentType=ch;
		}
		public char getsType()
		{
			return studentType;
		}
		public void SetStudentName(String firstname, String lastname)
		{
			firstname=firstname;
			lastname=lastname;
			studentName=firstname+lastname;
		}
		public String getStudentName()
		{
			return studentName;
			
		}
		
		public static void main(String[] args)
		{
			Student st = new Student();
			st.setstudentId(12);
			st.setsType('F');
			st.SetStudentName("ronish", "panjwani");
			System.out.println("Student Id  "+st.getstudentId());
			System.out.println("Student Type  "+st.getsType());
			System.out.println("Student Name  "+st.getStudentName());
			Student st1 =new Student(10,'L',"Firoj","Panjwani");
			System.out.println("Student Id  "+st1.getstudentId());
			System.out.println("Student Type  "+st1.getsType());
			System.out.println("Student Name  "+st1.getStudentName());
		}
}
