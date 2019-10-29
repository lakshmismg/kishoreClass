package kishoreClass1;

public class pVari extends LocalInsStatic 
 {

	public static void main(String[] args) {
		 //pVari Cross = new PVari ();
			//Cross.multi();
		pVari result=new pVari();
		result.Sum();
		
		result.Sum();
	    //System.out.println(result.abcd);
	    System.out.println ("INSTANCE TO static Variable:"+ result.abc);
		System.out.println ("STATIC TO STATIC: "+ LocalInsStatic.abcd );
	    

	}
	  public  void Sum()      //INSTANCE METHOD
	   {
		   
		   int x = 10;
		   System.out.println("Accesing usd from main method"+ x);
		   
		   }
}
