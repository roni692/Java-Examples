package courseregistration;

class InheritClass implements Child
{
	public void printparentone()
	{
		System.out.println(pOne);
	}

	@Override
	public void printParentOne() 
	{
		// TODO Auto-generated method stub
		System.out.println(pTwo);
	}

	@Override
	public void printParentTwo() 
	{
		// TODO Auto-generated method stub
		System.out.println(pTwo);
	}

	@Override
	public void printChild() 
	{
		// TODO Auto-generated method stub
		System.out.println(child);
	}
}
