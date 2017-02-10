package overriding;

/* 			base class method  - overridden method
 * 					|
 * 			derived clas method  - overriding method 
 * 
 * A derived class can override an instance method defined in a base class by defining an instance method 
 * with the same method signature/method name and number and types of method parameters. (polymorphic methods.)
 * 
 * To override a method =>  the parameter list of the methods in the base and derived classes must be exactly the same.

 * The static methods of a base class => can’t be overridden  (they are bound at compile time )
 * 
 */

public class BookExample {
	
	public static void main(String[] args) {
		Book b = new CourseBook(true);
		b.issueBook(100);  /*  To compile b.issueBook(), the compiler refers only to the definition of class Book.
							To execute b.issueBook(), the JRE uses the actual method implementation of issueBook() from class CourseBook */
		b = new CourseBook(false);
		b.issueBook(100);
		b = new Book();
		b.issueBook(100);
		
	}

}

class Book {
	
	void issueBook(int days) {
		if (days > 0)
			System.out.println("Book issued");
		else
			System.out.println("Cannot issue for 0 or less days");
	}

}

class CourseBook extends Book{
	
	boolean onlyForReference;
	CourseBook(boolean val) {
		onlyForReference = val;
	}

	@Override
	void issueBook(int days) {
		if (onlyForReference)
			System.out.println("Reference book");
		else
			if (days < 14)
				super.issueBook(days);
			else
				System.out.println("days >= 14");
	}

}

/*********Correct syntax of overriding methods *********/

/* 1. Access Modifiers
 *  
 *  	class Book {
			protected void review(int id, List names) {}
		}
		class CourseBook extends Book {
			void review(int id, List names) {}
		}
	Won’t compile overriding methods in derived classes can’t use a weaker access
 *
 * 2. NONACCESS MODIFIERS  
 *    
 *    class Book {
		final void review(int id, List names) {}
	  }
	  class CourseBook extends Book {
		void review(int id, List names) {}
	}
 *   Won’t compile; final methods can’t be overridden.
 * 
 *  3. ARGUMENT LIST AND COVARIANT RETURN TYPES 
 *      Covariant Type:-  When the overriding method returns a subclass of the return type of the overridden
 *		method, it’s known as a covariant return type.
 *		It you try to use covariant types in the argument list, you’ll end up overloading the methods and
 *		not overriding them.


		class Book {
			void review(int id, List names) throws Exception {
				System.out.println("Base:review");
			}
		}
		class CourseBook extends Book {
			void review(int id, ArrayList names) throws IOException {
				System.out.println("Derived:review");
			}
		}

		class Verify {
			public static void main(String[] args)throws Exception {
				Book book = new CourseBook();
				book.review(1, null);
				
			}
		}

 *   output of above code:- Calls review in book prints: Base:review 
 *   method review() in class CourseBook doesn’t override the review method in class Book, the JRE doesn’t have any
 *    confusion regarding whether to call method review() from class Book or from class
 *    CourseBook. It moves forward with calling review() from Book.
 *
 *  4. Exception Thrown
 *  
 *  i) An overriding method must either declare to throw no exception, the same exception, or
 *    a subtype of the exception declared to be thrown by the base class method, or else it will fail to compile. 
     Above rule doesn't apply to runtime exceptions
    ii)  An overriding method can declare to throw any Runtime Exception or Error, even if the overridden method doesn’t.

 * 
 * 
 *   Exception List               Some Checked Exception            |   No exception               
 *   (base class)                                                   | 
 * -----------------------------------------------------------------------------------
 *   Exception List     Allowed :- Same, Narrower, Error, Runtime   | Allowed :- Error, Runtime
 *  Overriding class    Not allowed :- None                         | Not allowed :- any other exception.
 *  ( derived class)
 *  
 *  
 */
		
		

