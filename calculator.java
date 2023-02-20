import java.util.Scanner;
class calculator 
{
	public static double add(double a,double b)
	{
		return a+b;
	}

	public static double sub(double a,double b)
	{
		return a-b;
	}
	public static double mul(double a, double b)
	{
		return a*b;
	}
	public static double div(double a, double b)
	{
		return a/b;
	}
	public static double mod(double a, double b)
	{
		return a%b;
	}
	public static void main(String[] args) 
	{
		boolean flag=true;
		while (flag)
		{
		System.out.println("=== CALCULATOR===");
		System.out.println("ENTER 1 FOR ADDITION");
		System.out.println("ENTER 2 FOR SUBSTRACTION");
		System.out.println("ENTER 3 FOR MULTIPLICATION");
		System.out.println("ENTER 4 FOR DIVISION");
		System.out.println("ENTER 5 FOR MODULUS");
		System.out.println("ENTER 6 FOR EXIT\n PLEASE ENTER YOUR CHOICE");
		Scanner obj=new Scanner(System.in);
		int choice = obj.nextInt();
		switch (choice)
		{
		case 1:{
			System.out.println("ADDITION\n please enter your numbers:");
			double num1=obj.nextDouble();
			double num2=obj.nextDouble();
			System.out.println("result is ="+add(num1,num2));
			break;
		}
		case 2:{
			System.out.println("Substraction\n Please enter your numbers");
			double num1=obj.nextDouble();
			double num2=obj.nextDouble();
			System.out.println("result is ="+sub(num1,num2));
			break;

		}
		case 3:{
			System.out.println("Multiplication\n Please enter your numbers");
			double num1=obj.nextDouble();
			double num2=obj.nextDouble();
			System.out.println("result is ="+mul(num1,num2));
			break;
		}
		case 4:{
			System.out.println("Division\n Please enter your numbers");
			double num1=obj.nextDouble();
			double num2=obj.nextDouble();
			System.out.println("result is ="+div(num1,num2));
			break;
		}
		case 5:{
			System.out.println("modulus\n Please enter your numbers");
			double num1=obj.nextDouble();
			double num2=obj.nextDouble();
			System.out.println("result is ="+mod(num1,num2));
			break;
		}
		case 6:{
			flag=false;
			System.out.println("____thanks for using calculator______");
		}
		}
		
		
		}
	}
}
