package jour06;

import java.util.Scanner;

public class Odev7UrunMiktari {

	public static void main(String[] args) {

//Kullanıcıdan alacağı ürün miktarını ve ürünün birim fiyatını alın.
//Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın ve ödemesi gereken toplam parayı ekrana yazdırın. 
//Diğer durumlarda  ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		
       Scanner scan = new Scanner(System.in);

	   System.out.println("Lutfen urun miktarini giriniz");
	   
	   double miktar = scan.nextDouble();
		
	   System.out.println("Lutfen birim fiyati giriniz");
		
	   double birimFiyat = scan.nextDouble();
	   
	   if(miktar>1000) {
	   System.out.println(birimFiyat*90/100*miktar);
	   }else {System.out.println(birimFiyat*miktar);}
		
		
	}

}
