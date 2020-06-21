package jour09;

import java.util.Scanner;

public class Odev05SwitchStatementSorular {

	public static void main(String[] args) {

//5.  Ku//5.  kullanıcıdan A, B, C, D harflerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın. 
		//A, B, D den biri ise ekrana “Yanlış cevap” yazdırın. 
		//Bu harflerin dışındaki harfler için “Geçersiz cevap şıkkı” yazdırın.
		
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Lutfen bir harf giriniz");
        
        char harf = scan.next().charAt(0);
        
        switch(harf) {
        case 'A':
            System.out.println("Yanlış cevap");
            break;
        case 'B':
            System.out.println("Yanlış cevap");
            break;
        case 'C':
            System.out.println("Doğru cevap");
            break;
        case 'D':
            System.out.println("Yanlış cevap");
            break;
        default:
            System.out.println("Geçersiz cevap şıkkı");
        }
        scan.close();
	}

}
