package com.game.card;

public class CardMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card cd[];
		cd = new Card[4];
		
		cd[0] = new Card("Vishal","8765876","23/03/2024") {};
		cd[1] = new Card("Vishal","8765876","23/03/2024") {};
		cd[2] = new Card("Vishal","8765876","23/03/2024") {};
		cd[3] = new Card("Vishal","8765876","23/03/2024") {};
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("The Card Holder Details are : ");
		for(Card cd1: cd) {
			cd1.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		MembershipCard mcd[];
		mcd = new MembershipCard[4];
		
		mcd[0] = new MembershipCard("Vishal","8765876","23/03/2024",5);
		mcd[1] = new MembershipCard("Vishal","8765876","23/03/2024",4);
		mcd[2] = new MembershipCard("Vishal","8765876","23/03/2024",5);
		mcd[3] = new MembershipCard("Vishal","8765876","23/03/2024",4);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("The MemberShip Card Holder Details are : ");
		for(MembershipCard mcd1: mcd) {
			mcd1.display();
		}
		System.out.println("-----------------------------------------------------------");
		
		PaybackCard pcd[];
		pcd = new PaybackCard[4];
		
		pcd[0] = new PaybackCard("Vishal","8765876","23/03/2024",50,2000);
		pcd[1] = new PaybackCard("Vishal","8765876","23/03/2024",400,5000);
		pcd[2] = new PaybackCard("Vishal","8765876","23/03/2024",55,8000);
		pcd[3] = new PaybackCard("Vishal","8765876","23/03/2024",47,6000);
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("The Payback Card Holder Details are : ");
		for(PaybackCard pcd1: pcd) {
			pcd1.display();
		}
		System.out.println("-----------------------------------------------------------");

	}

}
