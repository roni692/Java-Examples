package Trainingdaythree;

public class PostGradStudent extends Studenttwo
{
	int postCourseId;
	String postCourseName;
	int postCoursefees;
	PostGradStudent(int pid, String pName, int pcfees,int Sid,char Stype,String Sname)
	{
		super(Sid,Stype,Sname);
		postCourseId = pid;
		postCourseName =pName;
		postCoursefees = pcfees;
		
	}
	int getpostCourseId()
	{
		return postCourseId;
	}
	String getpostCourseName()
	{
		return postCourseName;
	}
}
