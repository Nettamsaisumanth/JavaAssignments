/*.Create an abstract class named Card with the following protected attributes / member variables.
 String holderName;
 String cardNumber;
 String expiryDate;
 Include appropriate getters and setters.
 Include appropriate constructors. In the 3-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate.
 Create a class named MembershipCard. The class MembershipCard is a derived class of Card. Include the following private attributes / member variables.
 Integer rating
 Include appropriate getters and setters.
 Include appropriate constructors. In the 4-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, rating.
 Create a class named PaybackCard. The class PaybackCard is a derived class of Card. Include the following private attributes / member variables.
 Integer pointsEarned;
 Double totalAmount;
 Include appropriate getters and setters.
 Include appropriate constructors. In the 5-argument constructor, the order of the arguments is holderName, cardNumber, expiryDate, pointsEarned, totalAmount.
 Create another class called Main. In the method, create instances of the above classes and test the above classes. The card details are entered separated by a ‘|’.
All text in bold corresponds to input and the rest corresponds to output.
 Sample Input and Output 1:
 Select the Card
 1.Payback Card
 2.Membership Card
 1
 Enter the Card Details:
 Anandhi|12345|14/01/2020
 Enter points in card
 1000
 Enter Amount
 50000
 Anandhi's Payback Card Details:
 Card Number 12345
 Points Earned 1000
 Total Amount 50000.0
*/

package com.problem3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] cardDetails;
		System.out.println("Enter Details");
		cardDetails = scanner.next().split("\\|");
		System.out.println("Enter 2 for payback card\n  1 for membership card");
		System.out.println("Enter  number");
		int input = scanner.nextInt();
		if (input == 1) {

			String holderNmae = cardDetails[0];

			String cardName = cardDetails[1];

			String expiryDate = cardDetails[2];

			System.out.println("Enter rating");
			float rating = scanner.nextFloat();

			MembershipCard card = new MembershipCard(holderNmae, cardName, expiryDate, rating);

			System.out.println(" Your name is " + card.getHolderName());
			System.out.println(" Your card name is " + card.getCardName());
			System.out.println(" Your name is " + card.getExpiryDate());
			System.out.println(" Your name is " + card.getRating());
		}

		if (input == 2) {

			String holderNmae = cardDetails[0];

			String cardName = cardDetails[1];

			String expiryDate = cardDetails[2];

			System.out.println("Enter rating");
			float rating = scanner.nextFloat();

			System.out.println("Enter points earned");
			float pointsearned = scanner.nextFloat();
			PaybackCard card = new PaybackCard(holderNmae, cardName, rating, expiryDate, pointsearned);

			System.out.println(" Your name is " + card.getHolderName());
			System.out.println(" Your card name is " + card.getCardName());
			System.out.println(" Your expiry is " + card.getExpiryDate());
			System.out.println(" Your rating is " + card.getRating());
			System.out.println("Your pintsearned " + card.getPointsearned());
		}

		scanner.close();

	}
}
