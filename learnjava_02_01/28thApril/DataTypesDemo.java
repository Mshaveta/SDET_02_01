/*
ClassName- firstletter uppercase
variables- lowercase,
invalid: 
NAME(works, but no acc. to coding std.)
1name (doesn't work)

valid:name,firstname,
first_name,firstName,

_first_name----config.

name
Name

*/
class DataTypesDemo
{
	public static void main(String[] args)
	{
		 byte b=10;
		 short s = 100;
		 int i=1200;
		 long l=1600;
		 System.out.println(b);
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(l);
		 
		 s=234;
		 System.out.println(s);
		 
		 int d=900;
		 int c = d;
		 //int d=c;
		 System.out.println(c);//200
		 System.out.println(d);//200
		 
		 float f = 23.4f;//double value---8 byte (4 bytes)
		 
		System.out.println(f);//200 
		 
		 double x = 23.4;//double value---8 byte (4 bytes)
		 
		System.out.println(x);//200
		
	}	
}
