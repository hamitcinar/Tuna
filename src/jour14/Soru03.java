package jour14;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {


		//Kullanıcıya sayı girmesini söyleyin. 
		//Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu  tüm sayıların toplamını yazdırınız.
		//Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
         Scanner scan = new Scanner(System.in);
		
		System.out.println("Sayi giriniz");
		
		int num=0;
		int sum=0;
		
		do {
			num=scan.nextInt();
			sum=sum+num;
			System.out.println("tekrar deneyiniz");
		}while (num!=0);
		
		System.out.println(sum);
		scan.close();
	}

}
