package jour28;


public class Animal {

	public int age;
	protected String name;
	
	public static void main(String[] args) {

    Animal animal = new Animal();

	}

	public void move() {
		System.out.println("Hareket edebiliyor");
	}
	protected void eat() {
		System.out.println("Yemek yer");
	}
	
	Animal(){
		System.out.println("Animal parametresiz constructor");
	}
	Animal(int age){
		System.out.println("Animal parametreli constructor");
}
	public int setAge(int age1) {
		return age= age1;
	}
}