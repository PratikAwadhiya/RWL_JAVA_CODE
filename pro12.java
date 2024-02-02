//Instance Method(oops-programing) 

class Circle
{
	//instance variable
	double radius;

	//Instance method for calculating area
	double calculateArea()
	{
		return 3.14 * radius * radius;
	}

	public static void main(String args[])
	{
		//object create
		Circle myCircle = new Circle();
		myCircle.radius = 5;

		
		//call the instance method
		double area = myCircle.calculateArea();
		System.out.println("Area of Circle : " + area);
	}
}