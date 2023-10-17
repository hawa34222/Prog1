package prov1;

import java.util.Scanner;

public class upp3 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println(" ange täljare: ");
		
		int täljare=input.nextInt();
		
		System.out.println(" ange nämnare: ");
		
		int nämnare=input.nextInt();
		
		int svar=(täljare)/(nämnare);
		
		System.out.println("svar: " +svar);
		
		
		
		
		
		
	}
}
