package arithmaticcalculator;
import java.util.Scanner;
public class ArithmeticCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the two numbers");
		int num1=sc.nextInt();
		int num2= sc.nextInt();
		System.out.println("Enter the case value ");
		int op = sc.nextInt();
		double a=0;
		switch(op){
		case 1: a=num1+num2;
		break;
		case 2:a=num1-num2;
		break;
		case 3: a=num1*num2;
		break;
		case 4:a=num1/num2;
		break;
		default:
			System.out.println("enter a valid case value");
		}
	System.out.println("the answer of a = " + a);
	}
}
