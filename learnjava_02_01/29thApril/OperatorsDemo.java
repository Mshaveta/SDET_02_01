class OperatorsDemo{
	public static void main(String[] args){
		int a=10; //11
		/* System.out.println(a);//10
		//1 way
		System.out.println(a++);//post inc.---10
		//a=11
		
		System.out.println(a);//11 */
		/* 
		int b=a++;///value of a will be assigned to b first then inc .
		System.out.println(b);//10
		System.out.println(a); */
		 
		
		//System.out.println(a++ + a + a++ + a);//a=11---12
		//10 + 11 + 11 + 12=44
		
		
		//
		//10 11 11 12
		//40
		
		/* 
		int c = a++ + a + a++ + a; //44
		System.out.println(c);//44
		System.out.println(a); //12 */
		
		//Pre incement
		/* System.out.println(++a);  //11
		//a=11---12
		int x=++a;//11--12
		
		System.out.println(x);//12
		System.out.println(a);//12 */
		
		//a=10--->11
		a++;//10--->11
		++a;//11-->12
		//M/m---->a=12---13---14--->15
		int c = a++ + ++a + a + a++;//12 + 14 + 14 + 14=54
		System.out.println(a);//15
		System.out.println(c);//54
		
		
		
		
		 
		 
	}
}