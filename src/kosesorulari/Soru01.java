package kosesorulari;

public class Soru01 {

	public static void main(String[] args) {
		// 1-)Bir string’i ters çeviren uygulama yaz.  

		//1.yol
		String oy = "Oyonnax";
		String[] oy1 = oy.split("");
		
		for(int i=oy1.length-1;i>=0;i--) {
			System.out.print(oy1[i]);
		}
		System.out.println(" ");
		
		//2.yol
		
		String br = "Bordeaux";
		for (int i = br.length()-1; i >=0; i--) {
			System.out.print(br.charAt(i));
		}
		
		 
	} 

}
