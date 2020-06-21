package wrapper;

import java.util.Scanner;

public class milikilometreyecevir {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen kilometre giriniz");
		
		double kilometre = scan.nextDouble();
		
		System.out.println(kilometre / 1.6);
	}

}
