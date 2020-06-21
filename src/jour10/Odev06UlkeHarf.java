package jour10;

import java.util.Scanner;

public class Odev06UlkeHarf {

	public static void main(String[] args) {

		//Kullanıcıdan yaşadığı ülkenin ismini alın
		//bu ülkenin bastan ikinci harfi ile sondan ikinci harfini  büyük harf olarak ekrana yazdırın

		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("ulkenizin ismini giriniz");
		
		
		
		String ulke = scan.nextLine();
		System.out.print(ulke.toUpperCase().charAt(1));
		int length = ulke.length();
		System.out.println(ulke.toUpperCase().charAt(length-2));
		
		scan.close();

	}

}
