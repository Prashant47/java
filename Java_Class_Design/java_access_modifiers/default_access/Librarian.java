package defaultaccess.library;
/* Default access class Book can be used by reference within the same package. 
 * 
 */
public class Librarian {
	
	public Librarian () {
		Book book = new Book();
		int c = book.issueCount;
		book.issueHistory();
	}
}
