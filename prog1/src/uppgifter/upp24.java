package uppgifter;

import java.util.Scanner;

public class upp24 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Ange ett heltal: ");
		
		int heltal=input.nextInt();
		
		char tecken=(char)heltal;
		
		System.out.println("tecknet för värdet " +heltal+ " är " +tecken);
		
		
		input.close();
		
		
	}

}
