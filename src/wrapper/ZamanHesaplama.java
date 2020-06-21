package wrapper;

import java.util.Scanner;

public class ZamanHesaplama {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("yili giriniz");
		
		int yil = scan.nextInt();
		
		
		System.out.print(yil*12);
		System.out.print(" ");
		System.out.println("Ay");
		
		System.out.print(yil*54);
		System.out.print(" ");
		System.out.println("Hafta");
		
		
		System.out.print(yil*365);
		System.out.print(" ");
		System.out.println("Gun");
		
		
		
		
		
		
		
		

	}

}
