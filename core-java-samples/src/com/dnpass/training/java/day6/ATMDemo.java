package com.dnpass.training.java.day6;
import java.util.*;
public class ATMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("select the card: \n 1:payback Card \n 2:Membership Card");
		int cardType = sc.nextInt();
		sc.nextLine();
		String[] cardDetails = new String[3];
		
		
		if(cardType > 0 && cardType<3) {
			System.out.println("enter the card details: ");
			cardDetails = sc.nextLine().split("\\|");
					
		}
		switch(cardType) {
		case 1: //payback card
			System.out.println("Enter points in card : ");
			int points =sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Amount :");
			double amount = sc.nextDouble();
			PaybackCard card1 = new PaybackCard(cardDetails[0],cardDetails[1],cardDetails[2],points,amount);
			card1.printDisplay();
			break;
			
		case 2: //for membership card
			System.out.println("Enter rating: ");
			int rating = sc.nextInt();
			sc.nextLine();
			MembershipCard card2 = new MembershipCard(cardDetails[0],cardDetails[1],cardDetails[2],cardDetails[3],rating);
			card2.printDisplay();
			break;
		}
		sc.close();

	}

}
