package jour11;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {


		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın
		//ve başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıları ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayinin baslangic degerini yaziniz");
		int bas =scan.nextInt();
		System.out.println("Lutfen sayinin bitis degerini yaziniz");
		int bit =scan.nextInt();
		for(int i=bas; i<bit; i++) {
			System.out.println(i);
		}
		scan.close();
	}

}
