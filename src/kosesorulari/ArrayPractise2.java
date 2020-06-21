package kosesorulari;

public class ArrayPractise2 {

	public static void main(String[] args) {
		//11. Bir Array olusturup onu tersten yazdiralim
		
		char arr[] = {'z','a','m','a','n'};

		for (int i = arr.length-1;i>=0; i--) {
			System.out.print(arr[i]);//namaz
			
		}
		System.out.println();
		//12.ic ice 4 indexli 3 er elemanli multidimensional array olusturup elemanlari toplayiniz
		
		int arr1[][]={ {1,2,3}, {4,5,6}, {7,8,9},{10,11,12}};
		int sum=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum=sum+arr1[i][j];
			}
		}
		System.out.println("Toplam:"+sum);
	}

}
