package defaultaccess.building;
import defaultaccess.library.Book;

/* default access class can not be extended in different package.
 * Below code won't work
 * 
 */
public class StoryBook extends Book {
	
	public StoryBook(){
		int c = issueCount;
		issueHistory();
	}

}
