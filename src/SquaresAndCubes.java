import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		boolean user = true ;
		System.out.println("Enter a number:");
		int num1 = scnr.nextInt();

		while(user) {
			for (int j = 1; j <= num1; j++) {
				for (int i = 1; i <= num1; i++) {
					int square = (i * i);
					int cube = (i * i * i);
					System.out.printf("%-10d %-10d %-10d", i, square, cube);
					System.out.println();
					System.out.println("Number " + " " + " Squared " + " " + " Cubed ");
					System.out.println("-------" + " " + " --------" + " " + "-----");
					System.out.println("-------" + " " + " --------" + " " + "-----");
				}

				scnr.nextLine();
				System.out.println("Would you like to continue yes or no?");
		        String response = scnr.nextLine();
			    user = response.equals("yes");	
			}

		} 
	}

}
