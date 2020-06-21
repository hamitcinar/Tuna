package jour06;

import java.util.Scanner;

public class Odev2SesliHarfSessizHarf {

	public static void main(String[] args) {

		
		//Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın. 
		//“b, c, d, ” den biri ise ekrana “Sessiz harf” yazdırın

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen “a, e, i, o, u,b,c,d,g” harflerinden birini giriniz");
		
		String harf= scan.next();
		if(harf.equals("a")||harf.equals("i")||harf.equals("e")||harf.equals("o")||harf.equals("u")){
		
		System.out.println("Sesli harf");
		
		}if(harf.equals("b")||harf.equals("d")||harf.equals("g")||harf.equals("c")) {
			
			System.out.println("Sessiz harf");
		}
	scan.close();
	}

}
