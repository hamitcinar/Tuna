package jour06;

import java.util.Scanner;

public class Odev1UcunKatiYazdirmak {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");

		int num1 = scan.nextInt();
		
		if(num1%3==0) {
			System.out.println("3un kati");
		}
		
		if(num1%3!=0) {
			System.out.println("3 un kati degildir");
		}
	}

}
