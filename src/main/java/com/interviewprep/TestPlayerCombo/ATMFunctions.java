package com.interviewprep.TestPlayerCombo;

import java.util.Scanner;

public class ATMFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int balance = 5000, withdraw,deposit;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("******** ATM ******************");
			System.out.println("Choose 1 for Balance");
			System.out.println("Choose 2 for Withdraw");
			System.out.println("Choose 3 for Deposit");
			System.out.println("Choose 0 for Exit");
			
			int n = s.nextInt();
			
			switch (n) {
			case 1:
				System.out.println("Balance - "+balance);
				System.out.println();
				break;
			case 2:
				System.out.println("Enter money to be withdrawn : ");
				withdraw = s.nextInt(); 
				if(balance-withdraw > 0){
					balance = balance -withdraw;
					System.out.println("Please collect your money");					
				}else System.out.println("Insufficient Balance");
				break;
			case 3:
				System.out.println("Enter Amount to be deposited :");
				deposit = s.nextInt();
				balance+=deposit;
				break;
			case 0:
				System.out.println("Thank you for using our ATM!! Good Bye!!");
			default:
				break;
			}
		}
	
	
	}

}
