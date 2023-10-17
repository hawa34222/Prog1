package opperatorer;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		
		System.out.println("Ange varans pris: ");
		
		int pris = input.nextInt();
		
		System.out.println("Ange belopp som kunden ger: ");
		
		int belopp = input.nextInt();
		
		int tillbaka=belopp-pris;
		
		int tusen = tillbaka/1000;
		
		int rest = tillbaka%1000;
		
		int femhundra = rest/500;
		
		rest = rest%500;
		
		int tvåhundra = rest/200;
		
		rest = rest%200;
		
		int etthundra = rest/100;
		
		rest = rest%100;
		
		int femtio = rest/50;
		
		rest = rest%50;
		
		int tjugo = rest/20;
		
		rest =rest%20;
		
		int tio = rest/10;
		
		rest = rest%10;
		
        int fem = rest/5;
		
		rest = rest%5;
		
		int två = rest/2;
		
		rest = rest%2;
		
        int ett = rest/1;
		
		
		
		
		System.out.println(tusen+"st tusenlappar");
		System.out.println(femhundra+"st femhundralappar");
		System.out.println(tvåhundra+"st tvåhundralappar");
		System.out.println(etthundra+"st etthundralappar");
		System.out.println(femtio+"st femtiolappar");
		System.out.println(tjugo+"st tjugolappar");
		System.out.println(tio+"st tiokronor");
		System.out.println(fem+"st femkronor");
		System.out.println(två+"st tvåkronor");
		System.out.println(ett+"st enkronor");
		
		input.close();
		
	}

}
