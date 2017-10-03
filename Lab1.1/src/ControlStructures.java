//Saurav Hossain - 205030307
// Java Mr. Levin Pd:2

public class ControlStructures 
{
	public static void main(String [] args) 
	{ // call upon method here by typing in name and values if necessary or deleting comment signs in-front of them
		//PrimePrinter(50,10000);
		//FooBarBaz();
		//longway();
	}

	public static void PrimePrinter(int x,int y) 
	{//prints prime numbers where x is how many consecutive prime numbers are to be printed and y is factorlim 
	int counter = 0;
	 int i = 2;
		while (counter <= (x-1)) 
			{
				int fac = 2;
				for (int g = 2;g<=y;g++)
				{
					if (i==g) 
						{
							//herro
						}
				else if (i%g==0) {fac++;}
				}
				if (fac == 2) 
					{
						System.out.print(i+",");
						counter ++;	
					}
				i++;
			}
	}

	public static void FooBarBaz() 
	{//replaces multiples of 3 with foo, multiples of 7 with bar, multiples of 10 with baz, string makes it stack
		for(int i=0;i<=500;i++) 
			{
				String x = "";
				if (i%3==0||i%7==0||i%10==0) 
					{
						if (i%3 ==0) {x+="Foo";}
						if (i%7 ==0) {x+="Bar";}
						if (i%10 ==0) {x+="Baz";}
						System.out.println(x);
					}
				else 
					{
						System.out.println(i);
					}
			}
	}
	
	public static void longway() 
	{//alternative method of FooBarBaz using logic
		for(int n=1; n<=500; n++)
			{
				boolean twee = (n%3==0);
				boolean sev = (n%7==0);
				boolean tenz =(n%10==0);
				if (twee || sev || tenz) 
					{
						if (twee && sev && tenz) {System.out.println("foobarbaz");}
						else if (twee && sev) {System.out.println("foobar");}
						else if (twee && tenz) {System.out.println("foobaz");}
						else if (sev && tenz) {System.out.println("barbaz");}
						else if (twee) {System.out.println("foo");}
						else if (sev) {System.out.println("bar");}
						else if (tenz) {System.out.println("baz");}
					}
				else 
					{
						System.out.println(n);
					}
			}
	}
}
