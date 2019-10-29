package rShee;

public class San {

		void calculate(int a, int b)
	{
	System.out.print("Class San ,");
	}
	}

	class Y extends San
	{
	@Override
	void calculate(int a, int b)
	{
	System.out.print("Class Y ,");
	}
	}

	class Z extends Y
	{
	@Override
	void calculate(int a, int b) 
	{
	System.out.print("Class Z ,");
	}
	

	
	
	public static void main(String[] args)
	{
	San x = new Z();

	x.calculate(10, 20);

	Y y = new Z();

	y.calculate(50, 100);


	}
	}

