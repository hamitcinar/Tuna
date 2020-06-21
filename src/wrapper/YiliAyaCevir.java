package wrapper;

import java.util.Scanner;

public class YiliAyaCevir {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen yili giriniz");
		
		int yil = scan.nextInt();
		
		System.out.println(yil * 12);
		

	}

}
