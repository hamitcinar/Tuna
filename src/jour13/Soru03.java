package jour13;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {


		//Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız.
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir.
		
		Scanner scan= new Scanner(System.in);

		System.out.println("Lutfen bir sayi giriniz");
		int sayi=scan.nextInt();
		
		int num = sayi;
		
		while(num>=1) {
			if(sayi%num==0) {
				System.out.print(num+"-");
			}num--;
		}
		
		scan.close();
	}

}
