package jour10;

import java.util.Scanner;

public class Odev02Isim {

	public static void main(String[] args) {


		//Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin kaç harften oluştuğunu ekrana yazdırın
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk isminizi giriniz");
		
		String prenom = scan.next();
		int prenom1 = prenom.length();
		prenom.trim();
        System.out.println("Lutfen soyisminizi giriniz");
		
		String nom = scan.next();
		int nom1 = nom.length();
		prenom.trim();
		
		System.out.println(prenom1);
		System.out.println(nom1);
		
		scan.close();

	}

}
