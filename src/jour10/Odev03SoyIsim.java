package jour10;

import java.util.Scanner;

public class Odev03SoyIsim {

	public static void main(String[] args) {


		//3.  Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harflerini büyük harf olarak ekrana yazdırın

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen ilk isminizi giriniz");
		
		String prenom = scan.next();
		char prenom1 = prenom.toUpperCase().charAt(0);
		prenom.trim();
        System.out.println("Lutfen soyisminizi giriniz");
		
		String nom = scan.next();
		char nom1 = nom.toUpperCase().charAt(0);
		prenom.trim();
		System.out.println(prenom1);
		System.out.println(nom1);
		
		scan.close();
		
	}

}
