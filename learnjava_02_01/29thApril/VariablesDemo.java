class TypeCasting{
	public static void main(String[] args){
		byte b=10;//1
		short s = b;//2
		int i=s;//4	
		long l=i;//8
		System.out.print(b);//10	
		System.out.print(s);//10
		System.out.print("i");//i
		System.out.print("l");//l		
	}
}