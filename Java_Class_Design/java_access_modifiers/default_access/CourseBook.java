package defaultaccess.library;

/* Default access Class Book cane be extended by the class in the 
 *  same package CourseBook
 * 
 * 
 */
public class CourseBook extends Book {

	public CourseBook(){
		int c = issueCount;
		issueHistory();
	}
	

}
