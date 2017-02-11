package overloaded;

/* Apart from constructors you can initialise the instance variable of class using an instance initializer.
 * It's defined within a class, using a pair of {} & they’re invoked before a class constructor is invoked.
 * 
 * Why need instance initializer if you can initialize your instances using constructors?
 * 1. For a big class, it makes sense to place the variable initialization just after its declaration
 * 2. All the initializers are invoked, irrespective of the constructor that’s used to instantiate an object.
 * 
 */

public class InstanceInitializer {
	
	public InstanceInitializer() {
		System.out.println("InstanceInitializer:constructor1");
	}
	
	public InstanceInitializer(String a) {
		System.out.println("InstanceInitializer:constructor2");
	}
		
	{
		System.out.println("InstanceInitializer:init1");
	}
		
	{
		System.out.println("InstanceInitializer:init2");
	}
		
	public static void main(String[] args) {
		new InstanceInitializer();
		new InstanceInitializer("aValue");
	}


}


/*  Output of Code 
 *  InstanceInitializer:init1
 *  InstanceInitializer:init2
 *  InstanceInitializer:constructor1
 *  
 *  InstanceInitializer:init1
 *  InstanceInitializer:init2
 *  InstanceInitializer:constructor2
 *  
 */

