package Practice;

public class para_constructor {
	
	int c;
	 String abc;
	  public para_constructor(int a, String bcd)
	  {
		  this.c = a;
		  this.abc = bcd;
		  System.out.println("please print " + a + abc);	  }

	public static void main(String[] args) {
		 
		para_constructor obj = new para_constructor(100, "I am good");
		
		
	}
	

}
