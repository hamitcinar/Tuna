package jour08;

import java.util.Scanner;

public class Odev02TernaryOperator {

	public static void main(String[] args) {


		//2)Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tamsayi giriniz");
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int result = num1>num2 ? num1 : num2;
		
		System.out.println(result);

		
		
		scan.close();
	}

}
