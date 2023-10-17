package uppgifter;

import java.util.Scanner;

public class upp21 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("Ange basen: ");
		
		
		int basen= input.nextInt();
		
		System.out.println("Ange höjden: ");	
		
		int höjden=input.nextInt();
		
		int arean = (basen*höjden)/2;
		
		System.out.println("Arean av triangeln är: " + arean);
				
				
		
		input.close();
		
		
		
		
		
		
		
	}

}
