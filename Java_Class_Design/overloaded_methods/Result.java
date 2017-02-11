package overloaded;
/*
 * Overloaded methods are methods with the same name but different method parameter lists.
 * The parameter list can differ in following terms
 * 
 * 1. The change in the number of parameters that are accepted
 * 2. The change in the type of the method parameters that are accepted
 * 3. The change in the positions of the parameters that are accepted. e.g (int a, Double b) (Double a, int b)
 * 
 * The overloaded methods are bound at compile time and not runtime.
 * 
 * Imp: Overloaded methods might define a different return type or access modifiers or noaccess modifiers 
 * like (final or synchronised ) but they can not be dfined with only change in their return types of access or 
 * noaccess modifiers.
 *  

 */
public class Result {
	// 1. number of parameters that are accepted
	double calcAverage(int marks1, int marks2) {
		return (marks1 + marks2)/2;
	}
	
	double calcAverage(int marks1, int marks2, int marks3) {
		return (marks1 + marks2 + marks3)/3;
	}

	// 2. type of the method parameters that are accepted
	double calcAverage(int marks1, double marks2) {
		return (marks1 + marks2)/2;
	}
		
	double calcAverage(double marks1, double marks2) {
		return (marks1 + marks2)/2;
	}
	
	// 3. CHANGE IN THE POSITIONS OF METHOD PARAMETERS

	double calcAverage(double marks1, float marks2) {
		return (marks1 + marks2)/2;
	}
		
	double calcAverage(float marks1, double marks2) {
		return (marks1 + marks2)/2;
	}

	/*
	 * When Methods can not be overloaded
	 * 
	 * 1. when there is just a change in return type, following code won't work. 
	 * 
	 *  double calcAverage(int marks1, int marks2) {
			return (marks1 + marks2)/2;
		}
		
		int calcAverage(int marks1, int marks2) {
			return (marks1 + marks2)/2;
		}

	 * 
	 * 2. where there is just change in access modifiers
	 * 
	 *  public double calcAverage(int marks1, int marks2) {
			return (marks1 + marks2)/2;
		}
		
		protected double calcAverage(int marks1, int marks2) {
			return (marks1 + marks2)/2;
		}
	 * 
	 * 
	 * 
	 * 
	 */
	

}
