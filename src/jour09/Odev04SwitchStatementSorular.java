package jour09;

import java.util.Scanner;

public class Odev04SwitchStatementSorular {

	public static void main(String[] args) {


		//4.  Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
		//Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
		//Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
		//Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.

        Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ay ismini giriniz");
		
		String ay = scan.next();
		ay=ay.toLowerCase(); 
		
		switch(ay) {
		
		case "ocak":
			System.out.println("Bu ay 31 gundur");
			break;
		case "subat":
			System.out.println("Bu ay Şubat ayıdır");
			break;	
		case "mart":
			System.out.println("Bu ay 31 gundur");
			break;	
		case "nisan":
			System.out.println("Bu ay 30 gundur");
			break;
		case "mayis":
			System.out.println("Bu ay 31 gundur");
			break;
		case "haziran":
			System.out.println("Bu ay 30 gundur");
			break;
		case "temmuz":
			System.out.println("Bu ay 31 gundur");
			break;
		case "agustos":
			System.out.println("Bu ay 31 gundur");
			break;
		case "eylul":
			System.out.println("Bu ay 30 gundur");
			break;
		case "ekim":
			System.out.println("Bu ay 31 gundur");
			break;
		case "kasim":
			System.out.println("Bu ay 30 gundur");
			break;
		case "aralik":
			System.out.println("Bu ay 31 gundur");
			break;
			
		default :
				System.out.println("Gecersiz ay ismi girdiniz");
		}
	scan.close();
	}

}
