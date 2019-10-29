package HomeWork;

public class exampleConstructor {
	
			   int age;   //instance V
		   String name;      ///instance V
			
		   //Default constructor
		   exampleConstructor(){
			this.name="Chaitanya";
			this.age=30;
		   }
			
		   //Parameterized constructor
		   exampleConstructor(String n,int a){
			this.name=n;
			this.age=a;
		   }
		   public static void main(String args[]){
			   exampleConstructor obj1 = new exampleConstructor();
			   exampleConstructor obj2 = 
				       new exampleConstructor("Steve", 56);
			System.out.println(obj1.name+" "+obj1.age);
			System.out.println(obj2.name+" "+obj2.age);
		   }
		}
