package building;
import library.Book;

/* You can not access protected members (e.g author of Book class ) 
 * from different package without inheritance i.e without extending that class
 * So you can not access protected members of Book class in House class below
 * which is present in different package. The code below won't compile.
 * 
 */

public class House {
	
	public House(){
		Book book = new Book;
		book.author = "Prashant";
		book.modifyPublication();
	}
}
