package wrapper;

import java.util.Scanner;

public class ucgenincevresi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc sayi giriniz");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		
		System.out.println(sayi1 + sayi2 + sayi3);
	}

}
