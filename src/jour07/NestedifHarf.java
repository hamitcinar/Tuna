package jour07;

import java.util.Scanner;

public class NestedifHarf {

	public static void main(String[] args) {


		//Kullanıcıdan bir harf girmesini isteyin.  
		//Girdiği küçük harf ise harfin “a” olup olmadığını kontrol edin.
		//Harf “a” ise ekrana “Ilk küçük harf” yazdırın. “a” değil ise ekrana “Ilk küçük harf değil” yazdırın.
		//Girdiği büyük harf ise harfin “Z” olup olmadığını kontrol edin. Harf “Z” ise ekrana “Son büyük harf” yazdırın.
		//“Z” değil ise ekrana “Son büyük harf değil” yazdırın.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir harf giriniz");
		
		char harf = scan.next().charAt(0);
		
		
		

	}

}
