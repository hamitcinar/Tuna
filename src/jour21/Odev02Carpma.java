package jour21;

public class Odev02Carpma {

	public static void main(String[] args) {

		 //Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını
		 //ekrana yazdıran  bir program yazınız { {1,2,3}, {4,5}, {6} } 
		
		int arr [][]={ {1,2,3}, {4,5}, {6} } ;
		
		int product =1;
		
		for(int i=0;i<arr.length;i++) {
			for(int j = arr[i].length-1;j<arr[i].length;j++) {
				product=product*arr[i][j];
			}
		}System.out.println(product);

	}

}
