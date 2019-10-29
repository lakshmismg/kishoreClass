package rShee;


	
		public class Test {
			int i;
			public static void main(String[] args) {
			Test t1 = new Test();
			t1.i=100;
			System.out.println("t1: "+t1.i);
			Test t2 = new Test();
			t2.i=200;
			System.out.println("t1: "+t1.i);
			System.out.println("t2: "+t2.i);	
			Test t3 = new Test();
			t3.i=300;
			System.out.println("t1: "+t1.i);
			System.out.println("t2: "+t2.i);
			System.out.println("t3: "+t3.i);			
			t1=t3;
			System.out.println("after t1=t3, t1: "+t1.i);
			System.out.println("after t1=t3, t2: "+t2.i);
			System.out.println("after t1=t3, t3: "+t3.i);			
			t3.i=200+t1.i;
			System.out.println("after t3.i=200+t1.i, t1: "+t1.i);
			System.out.println("after t3.i=200+t1.i, t2: "+t2.i);
			System.out.println("after t3.i=200+t1.i, t3: "+t3.i);			
			t3= new Test();
			System.out.println("after t3= new Test(), t1: "+t1.i);
			System.out.println("after t3= new Test(), t2: "+t2.i);
			System.out.println("after t3= new Test(), t3: "+t3.i);			
			t2=t3;
			System.out.println("after t2=t3, t1: "+t1.i);
			System.out.println("after t2=t3, t2: "+t2.i);
			System.out.println("after t2=t3, t3: "+t3.i);
			}

			}