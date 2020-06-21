package Jour20;

public class SoruArrays {

	public static void main(String[] args) {
		  
		int arr[]= {1,2,3,4,5};

        int count=0;
		for(int i=0; i<5;i++) {
			for(int j=1;j<5;j++) {
				if(arr[i]==arr[j]) {
				count++;	
				}
			}
		}if (count >0) {
			System.out.println("var");
		}else {
			System.out.println("yok");
		}
		
	}

}
