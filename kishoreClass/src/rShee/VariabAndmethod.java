package rShee;

public class VariabAndmethod  {


			int i;    //instance variable
			int j;          //instance variable
			public static void main(String[] args) {                  //Static Method
				VariabAndmethod t1 = new VariabAndmethod();
			t1.i=200;                                                //t1=object
			t1.j=100;
			add(t1.i,t1.j);
			System.out.println(t1.i);
			System.out.println(t1.j);
			}

			public static void add(int i,int j) {        
			i=i+100;
			j=j+100;
			System.out.println(i);
			System.out.println(j);
			}
}
