class SumOfDigits
{
	/*
	n=453====>453%10===(n%10)==r1 = 3------------------1
	n=453
	
	
	
	
	n=453/10====>45===4,5
	n=45
	n%10====r2===5-------------------------------------2
	Syso(n)//45
	
	
	n = n/10=4
	Syso(n)//4
	
	
	
	
	n/10====>r3====4------------------------------------3
	*/
	public static void main(String[] args){
		int num=45678;//8
		int digit5  = num%10; //8
		System.out.println("digit 5 is: "+digit5);//8
		 
		
		num=num/10;//45678---->4567
		int digit4 = num%10; //7
		System.out.println("digit 4 is: "+digit4); 
		System.out.println("Num is: "+num);
		/*
		num=num/10;//4567---->456
		int digit3 = num%10; //6
		System.out.println("digit 3 is: "+digit3);
		
		num=num/10;//456---->45
		int digit2 = num%10; //5
		System.out.println("digit 2 is: "+digit2);
		
		int digit1=num/10;//45---->4
		System.out.println("digit 1 is: "+digit1);
		
		System.out.println("Reverse of a number: "+digit5+digit4+digit3+digit2+digit1);
		System.out.println("Sum of digits: "+(digit5+digit4+digit3+digit2+digit1));
		 */
		 
	}
}