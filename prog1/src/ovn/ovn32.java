package ovn;

import java.util.Arrays;
import java.util.Scanner;

public class ovn32 {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		int [] i = new int[3];
		
		System.out.println("ange ett tal: ");
		i[0]=input.nextInt();
		
		System.out.println("ange ett tal: ");
		i[1]=input.nextInt();
		
		System.out.println("ange ett tal: ");
		i[2]=input.nextInt();
			
		 int temp= i[0];
		 
		 i[0]=i[2];
		 i[2]=temp;
		
		System.out.println(Arrays.toString(i));
		
		
		input.close();
		
		
		
	}

}
