//do-while

class doDemo
{
	public static void main(String args[])
	{
		int sum =0;
		int x = 1;
			
		do
		{

			sum = sum + x;
			x++;
			
		}while(x<=20);

		System.out.println("Sum: " + sum);
		
	}
}