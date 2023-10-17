package uppgifter;

import java.util.Scanner;

public class upp22 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("ange ett ord på svenska: ");
		
		String svenska=input.nextLine();
		
		System.out.println("ordet på engelska");
		
		String engelska=input.nextLine();
		
		System.out.println(svenska+ " heter " +engelska+ " på engelska");
		
		
	
		
		input.close();
		
	}

}
