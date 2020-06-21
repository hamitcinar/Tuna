package jour15;

public class ArraySoru {

	public static void main(String[] args) {

int arr[]= {2,5,2,7,9,2,2};
		
		
		int y=0;
		int count=0;
		
		while(y<=6) {
			
		for (int i=y+1; i<=6 ; i++) {
			if (arr[i]==arr[y]) {
			System.out.println(i+". tekrar elemanidir.");
		count++;	}
			}
		y++;} if (count>0) {System.out.println(" Ayni eleman vardir");}
		else {System.out.println("Ayni eleman yoktur");

}}}