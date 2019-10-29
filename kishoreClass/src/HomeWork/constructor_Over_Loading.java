package HomeWork;

public class constructor_Over_Loading {
	
	
	int car;
	int fuelcapacity;
	String Brand;
	
	constructor_Over_Loading()
	{
		System.out.println("This is default constructor");
	}
	constructor_Over_Loading( String ns,int fc, int c )
	{
		this. car = c;
		this. fuelcapacity = fc;
		this. Brand = ns;
	System.out.println("This is parametriesed constructor"+ c + ns+ fc);
		}
	
	public static void main(String[] args) {
		constructor_Over_Loading obj= new constructor_Over_Loading();
		constructor_Over_Loading obj1=new constructor_Over_Loading("mercedes",200,300);
		
	
	}
	
	

	
	
}
