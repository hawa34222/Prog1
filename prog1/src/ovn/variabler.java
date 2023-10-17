package ovn;

import java.util.Scanner;

public class variabler {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		 System.out.print("Ange det första heltalet: ");
	        int tal1 = input.nextInt();

	        System.out.print("Ange det andra heltalet: ");
	        int tal2 = input.nextInt();

	        System.out.print("Ange det tredje heltalet: ");
	        int tal3 = input.nextInt();

	       
	        int summa = tal1 + tal2 + tal3;

	        
	        double medelvärdet =  summa / 3.0;

	        
	        System.out.println("Summan av talen är: " + summa);
	        System.out.println("Medelvärdet av talen är: " + medelvärdet);

	        input.close();
		
		 
		
		
	}

}
