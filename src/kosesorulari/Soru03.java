package kosesorulari;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// 3-)Bir sayının Mükemmel bir sayı olup olmadığını bulan metod yaz.
		/*MÜKEMMEL SAYI NEDİR?
		Kendisi hariç bütün pozitif bölenlerinin toplamı kendisine eşit olan sayılara mükemmel sayı denir.

		6 bir mükemmel sayıdır. Çünkü 6’nın pozitif bölenleri 1,2,3 ve 6’dır. Kendisi hariç diğer bölenlerini toplarsak 1+2+3=6 eder.

		Bunun gibi 28 de mükemmel sayıdır. 28 = 1 + 2 + 4 + 7 + 14  Mükemmel sayı bulma formülü = 2p−1(2p−1)*/
		Scanner scan= new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int num = scan.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if(num%i==0) {
				sum= sum+i;
			}if(num==sum) {
			System.out.println("Mukemmel Sayi");
			}else {
				System.out.println("Mukemmel sayi degil");
			}
		}
		
		scan.close();

	}

}
