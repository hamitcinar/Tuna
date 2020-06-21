package jour12;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  harflerini alın ve başlangıç harfinden başlayıp
		//bitiş harfinde  biten tüm harfleri büyük harf olarak ekrana yazdırın. 
		//Kullanıcının hata yapmadığını farz edin

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Baslangic harfini giriniz");
		char ch1 = scan.next().toUpperCase().charAt(0);
		System.out.println("Bitis harfini giriniz");
		char ch2 = scan.next().toUpperCase().charAt(0);
		System.out.println(ch1 + " - " + ch2);
		if(ch1>ch2) {			
			System.out.println("Harfleri alfabetik sirayla giriniz");}
						
			for(char i=ch1; i<=ch2; i++) {
				System.out.print(i + " ");	
		
			}
			scan.close();
		}
	}
		
		
		
	

		