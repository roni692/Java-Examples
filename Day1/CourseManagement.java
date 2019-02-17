package Training;

public class CourseManagement
{
	public static void main(String[] args)
	{
		Student s= new Student();
		System.out.println(s.studentid);
		System.out.println(s.studentType);
		s.studentid = 12;
		int r = s.getstudentid();
		System.out.println(r);
		//System.out.println(s.studentid);
		s.studentType = 'L';
		char ch1 = s.getstudentType();
		//System.out.println(ch1);		
		System.out.println(ch1);
	}

}
