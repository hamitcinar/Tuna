package jour08;

import java.util.Scanner;

public class Odev04TernaryOperator {

	public static void main(String[] args) {


		//Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		//En ve boy eşit ise ekrana “Kare” farklı ise ekrana “Dikdörtgen” yazdırın.
		
		
		Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin enini giriniz");
		
		double en = scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin boyunu giriniz");
		double boy = scan.nextDouble();
		
		String result = en == boy ? "kare"  : "Dikdortgen";
			
		System.out.println(result);
		
		scan.close();
		

	}

}
