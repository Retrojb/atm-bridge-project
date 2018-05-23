import java.util.Scanner;

public class AtmApp {
	public static void main(String[] args) {
		Atm atm = new Atm("1234");
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your PIN:  ");
		String userPin = input.nextLine();
		
		if (atm.isAllowedAccess(userPin)) {
			System.out.println("That PIN is correct!");
		} else {
			System.out.println("That PIN is incorrect...");
		}
	}
}
