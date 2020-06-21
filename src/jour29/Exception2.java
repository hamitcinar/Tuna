package jour29;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {

	public static void main(String[] args) {
		// C/ Yeni dosyayi programa ekleyiniz
		//FileNotFoundException ve ArithmeticException hatalari var
		
		try {
			FileInputStream ekle =new FileInputStream("C/");
			
		} 
		catch (FileNotFoundException e) {
			System.out.println("Baba aku yok");
			//e.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("Arabanin calismama sebeplerini bul");
			//e.printStackTrace();
		}
         
	}
    
}
