package HomeWork;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading   obj = new MethodOverloading();
		  obj.Div('b',300);
		  obj.Div(100,200);
		 
	}
	 public void Div(char a, int b)
	   {
		    
		  
		   System.out.println(a*b);
	   }

	 public void Div( int c,int d)
	   {
		    
		         
		   System.out.println(c*d);
		   System.out.println(c*c);
		   System.out.println(d*d);
	   }


}






