package overloaded;

/* The order of execution
 *  1. Parent initialization block 
 *  2. Parent constructor 
 *  3. Child initialization block
 *  4. Child constructor
 */


public class InstanceInitializerOrder {

}

class Instrument {
	Instrument() {
	System.out.println("Instrument:constructor");
	}
}


class Pencil extends Instrument {
	public Pencil() {
		System.out.println("Pencil:constructor");
	}
	{
		System.out.println("Pencil:instance initializer");
	}
	public static void main(String[] args) {
		new Pencil();
	}
}
