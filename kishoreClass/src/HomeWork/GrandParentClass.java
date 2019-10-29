package HomeWork;

public class GrandParentClass extends final_Keyword  {

	public static void main(String[] args) {
		GrandParentClass obj = new GrandParentClass();
		obj.GPKid1();
		obj.GPKid1();
		obj.method1();
		
		
	}
   public void GPKid1()
   {
	   
	   int a= 30;
	   int b= 40;
	   int c= a+b;
	   
	   System.out.println("This is Grand Parent Class" + c);
	   
	   
	   
	   
	   
   }
}
