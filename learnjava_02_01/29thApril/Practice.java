class OperatorsDemo{
	public static void main(String[] args){
		int a=10; 
		a++;
		int b=a++;
		int c = a++ + a + a++ + a; 
		
		++a; 
		int x=++a;
		
		a++;
		++a;
		
		c = a++ + ++a + a + a++;
		System.out.println(a);
		System.out.println(c);
		System.out.println(x);
		System.out.println(b);
		
		
		
		 
		 
	}
}