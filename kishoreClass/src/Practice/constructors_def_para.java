package Practice;

public class constructors_def_para  {
	
	int var;
	
	
	
	
	public constructors_def_para()
	{
		this.var = 10;
	}
	public constructors_def_para (int var)
	{
		this.var = var;
			
	}
    
    
  public static void main(String[] args) {
			
		constructors_def_para obj = new constructors_def_para();
		constructors_def_para obj2 = new constructors_def_para(40);
		int result = obj2.var;
          System.out.println(" COnstructor 2" + obj.var);
          System.out.println("constructor is "+ obj2.var);
	}

}
