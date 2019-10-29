package HomeWork;

public class ParentClass extends GrandParentClass {

	public static void main(String[] args) {
		ParentClass obj = new ParentClass();
		int result = obj.PPkid();
		System.out.println ("ppkid returning result is "  + result);
		obj.GPKid1();
		obj.CCkid();
	}
    public int PPkid()
    {
    	int x= 100;
    	int y = 1000;
    	int t = x+y;
    	return(t);
    	
    }
   public void CCkid()
   {
	   
	   System.out.println (" This is grandchild for grand pa");
   }
   


}



