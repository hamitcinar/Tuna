package jour10;

import java.util.Scanner;

public class Odev05Harf {

	public static void main(String[] args) {


		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harfini büyük harf olarak ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("ulkenizin ismini giriniz");
		
		
		
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(0));
		System.out.println(ulke.toUpperCase().charAt(1));
		
		scan.close();
		
	}

}
