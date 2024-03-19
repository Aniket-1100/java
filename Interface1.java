interface Human{
	public void eat();
}

public class Interface1{
	public static void main(String[] args){
		Human obj1 = ()->{
			System.out.println("HELLO");
		};
		obj1.eat();
		Human obj2 = ()->{
			System.out.println("Hii");
		};
		obj2.eat();
	}
}