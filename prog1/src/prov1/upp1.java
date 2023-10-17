package prov1;

import java.util.Scanner;



public class upp1 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		System.out.println("Ange måttet på första sidan: ");
		
		int sida1=input.nextInt();
		
		System.out.println("Ange måttet på den andra sidan: ");
		
		int sida2=input.nextInt();
		
		int arean= sida1*sida2;
		
		System.out.println("Sida1: " +sida1+ " Sida2: " +sida2+ " ger arean: " +arean);
		
		input.close();
		
	}

}
