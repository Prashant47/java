package building;
import library.Book;

/*
 * Protected Members are accessible in all derived classes event if they are 
 * defined in same or different package.
 * But you can not access protected members from different package with by reference
 * You need to access it through inheritance only.
 */

/*Accessing through Inheritance ==> Work */
public class StoryBook extends Book {

	public StoryBook () {
		 author = "Prashant Gonarkar";
		 modifyPublication();
	}
}

/*Accessing through reference ==> Won't Work */
 
/*public class StoryBook extends Book {
	
	public StoryBook(){
		Book book = new Book();
		String v = book.author;
		book.modifyPublication();
	}
}
*/	
	

