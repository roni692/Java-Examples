package courseregistration;

public interface Parentone 
{
	int pOne=1;
	void printParentOne();
}
interface ParentTwo
{
	int pTwo=2;
	void printParentTwo();
}
interface Child extends Parentone,ParentTwo
{
	int child =3;
	void printChild();
}
