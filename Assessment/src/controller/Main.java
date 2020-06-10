package controller;
import java.util.Scanner;

import model.Mini;
import model.SUV;
import model.Sedan;


//Solution without OOP
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("Enter the choice of your car: ");
//		System.out.println("1. Mini");
//		System.out.println("2. Sedan");
//		System.out.println("3. SUV");
//		Scanner sc = new Scanner(System.in);
//		int vehicleChoice = 0;
//		boolean vehicleChoiceValidation = false;
//		while(!vehicleChoiceValidation) {
//			
//			vehicleChoice = sc.nextInt();
//			if(vehicleChoice >= 1 && vehicleChoice <= 3) {
//				vehicleChoiceValidation = true;
//				break;
//			}
//			else {
//				System.out.println("Please re enter your choice: ");
//				vehicleChoiceValidation = false;
//			}
//		}
//		System.out.println("The entered choice is: " + vehicleChoice);
//		System.out.println("Please enter the distance to be travelled: ");
//		int distance = sc.nextInt();
//		System.out.println("The entered distance is: " + distance);
//		int cost = 0;
//		switch(vehicleChoice) {
//		case 1:
//			if(distance <= 75) {
//				cost = ((distance - 3) * 10) + 50;
//			}
//			else {
//				cost = distance * 8;
//			}
//			break;
//		case 2:
//			if(distance <= 100) {
//				cost = ((distance - 5) * 12) + 80;
//			}
//			else {
//				cost = distance * 10;
//			}
//			break;
//		case 3:
//				cost = ((distance - 5) * 15) + 100;
//			break;
//		default:
//			System.out.println("There is no car of this choice");
//		}
//	System.out.println("The cost for the ride in the chosen car is: " + cost);
//	}
//}


//Solution implementing OOP
public class Main {
	public static void main(String[] args) {
		System.out.println("Enter the choice of your car: ");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		Scanner sc = new Scanner(System.in);
		int vehicleChoice = 0;
		boolean vehicleChoiceValidation = false;
		while(!vehicleChoiceValidation) {
			
			vehicleChoice = sc.nextInt();
			if(vehicleChoice >= 1 && vehicleChoice <= 3) {
				vehicleChoiceValidation = true;
				break;
			}
			else {
				System.out.println("Please re enter your choice: ");
				vehicleChoiceValidation = false;
			}
		}
		System.out.println("The entered choice is: " + vehicleChoice);
		System.out.println("Please enter the distance to be travelled: ");
		int distance = sc.nextInt();
		System.out.println("The entered distance is: " + distance);
		int cost = 0;
		Mini mini = new Mini();
		Sedan sedan = new Sedan();
		SUV suv = new SUV();
		
		switch(vehicleChoice) {
		case 1:
			if(distance <= 75) {
				cost = mini.baseCostEstimation(distance); 
			}
			else {
				cost = mini.mileStoneCostEstimation(distance);
			}
			break;
		case 2:
			if(distance <= 100) {
				cost = sedan.baseCostEstimation(distance);
			}
			else {
				cost = sedan.mileStoneCostEstimation(distance);
			}
			break;
		case 3:
				cost = suv.baseCostEstimation(distance);
			break;
		default:
			System.out.println("There is no car of this choice");
		}
	System.out.println("The cost for the ride in the chosen car is: " + cost);
	}
}




