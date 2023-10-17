package prov1;

import java.util.Scanner;

public class upp2e {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Ange en mening: ");
		
		String mening=input.nextLine();
		
		
		int posMellan=mening.indexOf(' ');
		
		
		String Ord=mening.substring(0, 6);
		
	    int längd=mening.length();
		
		System.out.println("Mening: " +mening+ " Första ordet är: " + Ord+ " Meningen består av: " +längd+ " tecken" );
		
	
		
	}

}
