package jour07;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {


		//Kullanıcıdan cinsiyetini girmesini isteyin.Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın
				//Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın. Kadin ise yasini kontrol edin. 
				//Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın. Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.​
				
		        Scanner scan = new Scanner(System.in);
		
				
				System.out.println("Lutfen cinsiyetinizi giriniz");
				
				String cinsiyet = scan.next();
				
				System.out.println("Lutfen yasinizi giriniz");
				
				int yas = scan.nextInt();
						
				if(cinsiyet.equalsIgnoreCase("erkek")) {
				
				if (yas<18) {
				System.out.println("Erkek cocuk");
				}else if(yas>=18) {
				System.out.println("Adam");
				
				}}
				if(cinsiyet.equalsIgnoreCase("Kadin")) {
					if (yas<18) {
						System.out.println("Kiz cocuk");
						}else if(yas>=18) {
						System.out.println("Kadin");
						
						}
		         }		
					
				}
				
			}