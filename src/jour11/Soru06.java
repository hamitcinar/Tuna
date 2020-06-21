package jour11;

import java.util.Scanner;

public class Soru06 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  harflerini alın ve
		//başlangıç harfinden başlayıp bitiş harfinde  biten tüm harfleri
		//büyük harf olarak ekrana yazdırın
		
	        Scanner scan =new Scanner(System.in);
	        
	        System.out.println("Baslangic harfini giriniz");
	        
	        char ilkharf=scan.next().toUpperCase().charAt(0);
	        
	        System.out.println("Bitis harfini giriniz");
	        char sonharf= scan.next().toUpperCase().charAt(0);
	        
	        for(char i=ilkharf;i<=sonharf;i++) {
	            System.out.print(i);
	        
	        
	        
	        }
	      

		}
		
		
		
	}


