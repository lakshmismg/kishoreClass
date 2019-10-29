package HomeWork;

public  class final_Keyword {

	final int abc = 200;
	static final int abcd = 400;
	public static void main(String[] args) {

    int a = 500;
    int b = 300;
    final_Keyword obj = new final_Keyword();
     System.out.println(obj.abc);
    
     System.out.println(final_Keyword.abcd);
     obj.method1();
		
		
		
	}
       public final void method1()
          
       
       {
    	   
    	   
    	   int c = 700;
    	   int d = 800;
       int y = c + d;
       System.out.println ("Result = " +y);
    	   
       }
}
