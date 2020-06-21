package jour08;

import java.util.Scanner;

public class Odev03TernaryOperator {

	public static void main(String[] args) {


		//3.Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın.
		
        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir tamsayi giriniz");
		
		int num = scan.nextInt();
		
		int result = num>0 ? num  : num*-1 ;
		
		System.out.println(result);
		
		
		scan.close();

	}

}
