package ovn;

import java.util.Scanner;

public class upp27 {
	
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.println("ange ett tecken: ");
		
		String tecken=input.nextLine();
		
		System.out.println(tecken);
		
		char bokstav=tecken.charAt(0);
		
		int nummer= (int)bokstav;
		
		System.out.println(tecken+" har teckenkoden "+nummer);
		
		
		input.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
