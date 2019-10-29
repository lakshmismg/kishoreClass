package kishoreClass1;

public class UserDefinedClass3 {

	public static void main(String[] args) {
		// Method with return type and parameters
		UserDefinedClass3 Output= new UserDefinedClass3();
		     int result = Output.Multi(20000, 10000);
		     System.out.println(result);
		     
		     UserDefinedClass2 obj2 = new UserDefinedClass2();
		       obj2.Method2(1000, 2000);
		       
		       UserDefinedClass3 obj3 = new UserDefinedClass3();
		       obj3.avg();
		     
	}
  public int Multi (int v, int z)
		  {
            int i;
            i = v - z;
            return(i);
		  
		  }
	  
	private void avg() 
	
	{
		
		System.out.println ("this is defined as private, cann't be accessed");
	}
}
