package HomeWork;

public class ChildClass  extends ParentClass {

	public static void main(String[] args) {
		ChildClass A = new ChildClass();
		A.Baby();
		A.CCkid();
		A.GPKid1();
		int result = A.PPkid();
		System.out.println("This is ppkid results"+ result);
	
	}
    public  void Baby ()
    {
    	
    	System.out.println("This is grand grand baby");
    }
}
