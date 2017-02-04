package defaultaccess.building;

import defaultaccess.library.Book;

/* 
 * 
 */

public class House {
	
	public House() {
		
		Book b = new Book();   // You can create instance of class in different package as Book in public
		int b = b.issue;		// but you can not access its members as they are default access.
		b.issueHistory();

	}

}
