package overloaded;

/* Overloaded Constructors
 * 1. Overloaded constructors should be defined using different argument lists.
 * 2. Overloaded constructors can’t be defined by just a change in the access modifiers. but
 *   thye can be defined using different access modifiers.
 * 3. A constructor can call another overloaded constructor by using the keyword this.
 * 4. A constructor can’t invoke a constructor by using its class’s name.
 * 5. If present, the call to another constructor must be the first statement in a constructor.
 */


public class OverloadConstructor {
	
	String name;
	int age;
	OverloadConstructor() {
		OverloadConstructor(null, 0);  /* this won't compile, you can’t invoke a constructor within a class by using the class’s name. */

	}
	OverloadConstructor(String newName, int newAge) {
		name = newName;
		age = newAge;
	}
	OverloadConstructor() {
		System.out.println("No-argument constructor");  /*call to overloaded constructor must be first statement in constructor.
*/
		this(null, 0);
		}



}
