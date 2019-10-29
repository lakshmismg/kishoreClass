package HomeWork;

public class MethodOverRiding extends Parent {

	public static void main(String[] args) {

       MethodOverRiding obj = new MethodOverRiding();
       obj.Div();
       System.out.println("This worked as expected");
       obj.movie();

	}
	 public void Div()
	   {
		   
		   int a=300;
		   int b=400;
		   System.out.println(a*b);
		   System.out.println(a/b);
		   System.out.println(a+b);
		   super.Div();
	   }

     public void movie()
     {
    	 
    	 System.out.println("Movie is Good");
    	 
     }
    

}


