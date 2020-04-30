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
class VariableDemo
{
	public static void main(String[] args)
	{
		//Variable Declaration:- datatype variablename		
		String name;

		//Assigning the value
		name="Admin";

		//System.out.print(name);//Admin

			
		//decalration along with initilisation
		int marks=900;
			
		//String name;//Compilation Error

		name="SDET";
		System.out.print(name);//SDET
		
		int a=100;
		
		System.out.print("a");//a---""--String
		System.out.print(a);//100
		System.out.print('a');//a-----char
		a=900;
		System.out.print("a");//a---""--String
		System.out.print(a);//900
		System.out.print('a');//a-----char
		
		
	}	
}
