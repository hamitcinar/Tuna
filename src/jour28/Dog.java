package jour28;

public class Dog extends Mammal{

	public boolean sadik =true;
	
	
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.eat();
	}

	public void bark() {
		System.out.println("Kopekler havlar");
	}
	
	Dog(){
		super(); // istege bagli koysak da olur koymasak da
		         //this() ayni class icindeki parametresiz constructor u cagirmak icin kullanilir
		System.out.println("Dog parametresiz constructor");
	}
	protected void eat() {
		System.out.println("Dog kemik yer");
}
}