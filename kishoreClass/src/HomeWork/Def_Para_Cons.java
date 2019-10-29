package HomeWork;

public class Def_Para_Cons {

	
	String ab;
	int x;
	int rg;
	
	 public Def_Para_Cons(String abc,int y, int rgv)
	 {
		 this.ab = abc;
		 this.x =  y;
		 this.rg = rgv;
	 }
	
	
	
	public static void main(String[] args) {
		Def_Para_Cons  obj = new Def_Para_Cons ("Starwars",200,300);
		System.out.println(obj.ab);
		System.out.println(obj.x);
		System.out.println(obj.rg);
	}

}
