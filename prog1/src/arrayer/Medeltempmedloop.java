package arrayer;

import java.util.Scanner;

public class Medeltempmedloop {
	
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		int[] i = new int[7];
		
		double summa=0;
		for (int j = 0; j < i.length; j++);{
		
		System.out.println("ange temp: ");
		int j = 2;
		i[j] = input.nextInt();
		summa=summa+i[j];
		
		}
		
		double medel= summa / i.length;
		
		System.out.println("medel: " + medel);
		
		input.close();
			
	}

}
