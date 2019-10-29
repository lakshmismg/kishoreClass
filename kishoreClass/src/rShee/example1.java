package rShee;

public interface example1 {
	
		void f();
		}

		class Circle implements example1 {

		public void f() {	
		System.out.println("Interface");
		}
		public void c() {
		System.out.println("class");
		}
		
		

		public static void main(String[] args) {

		example1 obj = new Circle();
		obj.f();	
		}
		}
