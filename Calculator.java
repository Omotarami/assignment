import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Principal: ");
		int Principal = sc.nextInt();
		System.out.print("Enter R: ");
		Float R = sc.nextFloat();
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		double M = Principal *(R *Math.pow(1+R, n))/
				(Math.pow(1+R, n)-1);
//		System.out.println("M = " + M);
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.US);
		String dollar = currency.format(M);
		System.out.print(dollar);
		
	
		
		
		
	}
    
}
