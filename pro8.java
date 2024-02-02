//while-loop

class whileDemo

{
	public static void main(String args[])
	{
		int sum=0;
		int x = 1;
	
	
		while(x<=20)
		{
			sum = sum + x;
			x++;		
		}

		System.out.println("Sum: " + sum);
	}
}