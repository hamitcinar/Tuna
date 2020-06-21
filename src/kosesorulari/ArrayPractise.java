package kosesorulari;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractise {

	public static void main(String[] args) {
		// Kullanicidan kac elemanli bir array olusturacagini alaim
		//gitrilen elemanlari arraya atayalim
		//kendimizde bir int array olusturup ortak eleman var mi diye kontrol ediniz
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen kac elemanli bir Array olusturmak istediginizi giriniz");
		int num1= scan.nextInt();
		
		int arr[]= new int[num1];
		System.out.println("Lutfen Array elemanlarini giriniz");
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
		}System.out.println(Arrays.toString(arr));
		
		int arr1 []= {3,4,5,6};
	
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr[i]==arr1[j]) {
					System.out.print(arr[i]);
				}
			}
		}
		scan.close();
	}

}
