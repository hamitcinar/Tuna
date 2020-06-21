package jour14;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) {


		//Kullanıcıya iki sayı girmesini söyleyin.
		//Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
		//Eşit değilse tekrar iki sayı girmesini söyleyin.
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Başlangıç değerlerini giriniz");
		int bas =0;
		System.out.println("Bitis değerlerini giriniz");
		int son =0;
		
		do {
			son =scan.nextInt();
			bas =scan.nextInt();
			if(bas!=son) {
				System.out.println("Tekrar iki sayi giriniz");
			}}while(bas!=son);
			System.out.println("kare olusturdunuz");
			scan.close();
		}
	}


