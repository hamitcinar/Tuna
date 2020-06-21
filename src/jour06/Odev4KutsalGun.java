package jour06;

import java.util.Scanner;

public class Odev4KutsalGun {

	public static void main(String[] args) {

		
		//)Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar icin kutsal gün” yazdırın.
		//“Cumartesi” ise ekrana “Yahudiler icin kutsal gün” yazdırın. “Pazar” ise ekrana  “Hıristiyanlar icin kutsal gün” yazdırın

	Scanner scan = new Scanner(System.in);
	
	System.out.println("Lutfen bir gun yaziniz");
	
	String gun = scan.nextLine();
	
	if(gun.equals("Cuma")) {
	System.out.println("Muslumanlar icin kutsal gun");
			
	}if(gun.equals("Cumartesi")) {
			
	System.out.println("Yahudilerin kutsal gunu");
	}
			if(gun.equals("Pazar")) {
						
	System.out.println("Hristiyanlarin kutsal gunu");
	}else {
		System.out.println("kutsal gun degil");
	}
		
		scan.close();	
	}}
		
	


