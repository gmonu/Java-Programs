package hcl;
	
	public class Calculator {
	   public int add(int a, int b){
	          return a+b;
	   }
		
		public int sub(int a, int b){
	          return a-b;
	   }
		
		public int mul(int a, int b){
	          return a*b;
	   }
	public static void main(String args[])
	{
		System.out.println(add(10,20));
		System.out.println(sub(20,10));
	}	
	}

