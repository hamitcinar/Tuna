package jour06;

import java.util.Scanner;

public class Odev11NotYazdir {

	public static void main(String[] args) {


		//Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		//1. 50 den az - D     2. 50(dahil) ile 60 arası - C       3. 60(dahil) ile 80 arası - B.     4. 80(dahil) ustu- A

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen notunuzu giriniz");
		
		double not = scan.nextDouble();
		
		if(not<50) {
			System.out.println("D");
		}
		else if(not<60) {
			System.out.println("C");
			
	
     	}else if(not<80) {
		System.out.println("B");}
		
	    else{
	
	    System.out.println("A");}
		
		scan.close();
		}
	
	}


