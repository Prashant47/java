package defaultaccess.library;


/* 
 * The members of a class defined without using any explicit access modifier are defined
 *  with package accessibility (also called default accessibility). The members with package
 *  access are only accessible to classes and interfaces defined in the same package. 
 *  The can not be extended in class present in other package.
 */


/*Book Class declared with default access */
public class Book {
	int issueCount;
	void issueHistory () {}
}
