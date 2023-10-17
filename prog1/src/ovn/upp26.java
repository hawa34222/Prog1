package ovn;

import java.util.Scanner;

public class upp26 {
	
	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("ange ditt hela namn med mellanslag");
	
	String namn=input.nextLine();
	
	int posMellan=namn.indexOf(' ');
	
	System.out.println(posMellan);
	
	String surNamn=substring(0, posMellan);
	
	String lastNamn=namn.substring(posMellan+1);
	
	System.out.println("förnamn: " +surNamn " efternamn: " +lastNamn );
	
		
		
		
	
	}

}
