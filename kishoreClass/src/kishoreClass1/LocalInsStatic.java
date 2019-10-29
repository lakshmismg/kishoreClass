package kishoreClass1;

public class LocalInsStatic {
	int abc=1000;                     //iNSTANCE VARIABLE
	static int abcd = 2000; 
	char A = 'Q';
	
	
	//STATIC VARIABLE

	public static void main(String[] args) {    //static methpd
		int y= 4000;
		LocalInsStatic ins = new LocalInsStatic();
		
		System.out.println ("Local Variable: "+y);
		System.out.println ("INSTANCE TO static Variable:"+ ins.abc);
		System.out.println ("STATIC TO STATIC: "+ LocalInsStatic.abcd );
		
		LocalInsStatic Add = new LocalInsStatic();
		 Add.Sum();
		
		 LocalInsStatic Cross = new LocalInsStatic();
		Cross.multi();
		
		
		
	}
   public  void Sum()      //INSTANCE METHOD
   {
	   
	   int x = 10;
	   System.out.println("Accesing usd from main method"+ x);
	   
	   }

   private void multi ()  //INSTANCE BUT PRIVATE
   {

          String c = "ABC2000";
          System.out.print("Result Is:" +c);
   }
}




