import java.util.Scanner;
import java.text.*;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your buying price per share: ");
		double buyingPrice = scanner.nextDouble();
		int day = 1;
		double closingPrice = 0.1;
		DecimalFormat decimalFormat = new DecimalFormat("0.00");
		while(true) {
			System.out.println("Enter the closing price for day " + day + " (Any negative value to leave:)");
			closingPrice = scanner.nextDouble();
			if (closingPrice < 0.0) {
				break;
			}
			double earnings = closingPrice - buyingPrice;
			if (earnings > 0.0) {
				System.out.println("After day " + day + ", you earned " + decimalFormat.format(earnings) + " per share.");
			}else if (earnings < 0.0) {
				System.out.println("After day " + day + ", you earned " +  decimalFormat.format(-earnings) + " per share.");
			}else {
				System.out.println("After day " + day + ", you have no earning per share." );
			}
			day++;
		}
		scanner.close();
	}
}
