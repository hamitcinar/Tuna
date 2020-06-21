package jour09;

import java.util.Scanner;

public class Odev01SwitchStatementSorular {

	public static void main(String[] args) {


		//1.  Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın.
		//“Pazar” ise ekrana  “Hıristiyanlar için kutsal gün” yazdırın.
		//Diler günler icin “Kutsal gün değil” yazdırın.
		
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gun = scan.next();
		gun=gun.toLowerCase();
		
		switch (gun) {
		      
		case "cuma":
			System.out.println("Müslümanlar için kutsal gün");
			break;
		case "cumartesi":
			System.out.println("Yahudiler için kutsal gün");
			break;	
		case "pazar":
			System.out.println("Hristiyanlar için kutsal gün");
			break;	
		default:
			System.out.println("Kutsal gün değil");
			
			
			
			
			
		}
		
		scan.close();

	}

}
