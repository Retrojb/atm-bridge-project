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
			System.out.println("Press 2 to withdrawl funds");
			String userMenuResponse = input.nextLine();
			while (!userMenuResponse.equals("1") && !userMenuResponse.equals("2")) {
				System.out.println("That is not a valid option. Please try again.");
				System.out.println("Press 1 to deposit funds");
				System.out.println("Press 2 to withdrawl funds");
				userMenuResponse = input.nextLine();
			}
			if (userMenuResponse.equals("1")) {
				System.out.println("Please enter a deposit amount:  ");
				BigDecimal depositAmount = input.nextBigDecimal();
				System.out.println("Your deposit of " + depositAmount + " was successful.");
				System.out.println("Your balance is now " + atm.deposit(depositAmount));	
			}
			else if (userMenuResponse.equals("2"))
			{
				System.out.println("Please enter a withdrawl amount:  ");
				BigDecimal withdrawlAmount = input.nextBigDecimal();
				System.out.println("Your withdrawl of " + withdrawlAmount + " was successful.");
				System.out.println("Your balance is now " + atm.withdrawl(withdrawlAmount));
			}
			
			
			
		} else {
			System.out.println("That PIN is incorrect...");
		}
		
		input.close();
	}
}
