import java.math.BigDecimal;
import java.util.Scanner;

public class AtmApp {
	public static void main(String[] args) {
		Atm atm = new Atm("1234", new BigDecimal(100.0));
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your PIN:  ");
		String userPin = input.nextLine();
		
		if (atm.isAllowedAccess(userPin)) {
			System.out.println("That PIN is correct!");
			System.out.println("Press 1 to deposit funds");
			String userMenuResponse = input.nextLine();
			while (!userMenuResponse.equals("1")) {
				System.out.println("That is not a valid option. Please try again.");
				System.out.println("Press 1 to deposit funds");
				userMenuResponse = input.nextLine();
			}
			System.out.println("Please enter a deposit amount:  ");
			BigDecimal depositAmount = input.nextBigDecimal();
			System.out.println("Your deposit of " + depositAmount + " was successful.");
			System.out.println("Your balance is now " + atm.deposit(depositAmount));
		} else {
			System.out.println("That PIN is incorrect...");
		}
		
		input.close();
	}
}
