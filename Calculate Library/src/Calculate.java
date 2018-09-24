/*
 * This class contains the methods to do various math related task
 * @author Andre Fleifel
 * @version 1.0
 * @date 8-6-18
 */
public class Calculate {
	
	//A call to square returns the square of the value passed.
	public static int square(int a) {
		return a*a;
	}
	
	//A call to cube returns the cube of the value passed. 
	public static int cube(int a) {
		return a*a*a;
	}
	
	//A call to average returns the average of the values passed to it.
	public static double average(double a, double b) {
		return (a + b)/2;
	}
	
	//Another average method.  This one accepts three doubles and returns a double.
	//Also an Overload
	public static double average(double a, double b, double c) {
		return (a + b + c)/3;
	}
	
	//A call to toDegrees converts an angle measure given in radians into degrees.
	public static double toDegrees(double radian) {
		return (180/3.14159)*radian;
	}
	
	//A call to toRadians converts an angle measure given in degrees into radians.
	public static double toRadians(double radian) {
		return (3.14159/180)*radian;
	}
	
	//A call to discriminant provides the coefficients of a quadratic equation in standard 
	//form (a, b, and c) and returns the value of the discriminant. 
	public static double discriminant(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		return discriminant;
	}
	
	//A call to toImproperFrac converts mixed number to an improper fraction.
	public static String toImproperFrac(int a, int b, int c) {
		return a * c + b + "/" + c;
	}
	
	//A call to toMixedNum converts an improper fraction into a mixed number.
	public static String toMixedNumber(int a, int b) {
		return a / b + " " + a % b + "/" + b;
	}
	
	//A call to foil converts a binomial multiplication of the form (ax + b)(cx + d)
	//into a quadratic equation of the form ax^2 + bx + c. 
	public static String foil(int a, int b, int c, int d) {
		return a * c + "x^2" + "+" + (a * d + b * c) + "x" + b * d;
	}
	
	//A call to isDivisibleBy determines whether or not one integer is
	//evenly divisible by another.
	public static boolean isDivisibleBy(int a, int b) {
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
		
	//A call to absValue returns the absolute value of the number passed.
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		} else if (a == 0) {
			return 0;
		} else {
			return -a;
		}
	}
	
	//A call to max returns the larger of the values passed.
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		} 
	}

	//Overload the max method.
	public static double max(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else {
			return c;
		}
	}
	
	//A call to min returns the smaller of the values passed.
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		} else if (b < a) {
			return b;
		} else {
			return a;
		}
	}

	//A call to round2 rounds a double correctly to 2 decimal places and
	//returns a double.
	public static double round2(double a) {
		double b = (a * 1000) % 10;
		if (b <= 4) {
			return (a * 1000 - b) / 1000;
		} else {
			return (a * 1000 - b + 10) / 1000;
		}

	}
	
	//A call to exponent raises a value to a positive integer power.
	public static double exponent(double a, int b) {
		if (b==0) {
			return 1;
		}
		double result = a;
		for (int x = 2; x <= b; x++) {
			result *= a;
		}
		return result;
	}
	
	//A call to factorial returns the factorial of the value passed.
	public static int factorial(int a) {
		int answer = a;
		for (int n = a; n >= 2; n--) {
			answer *= n - 1;
		}
		return answer;
	}
	
	//A call to isPrime determines whether or not an integer is prime.
	public static boolean isPrime(int number) {
		int factorCount = 1;
		for (int i = 2; i < number; i++) {
			boolean test = isDivisibleBy(number, i);
			if (test == true) {
				factorCount++;
			}
		}
		if (factorCount > 1) {
			return false;
		} else {
			return true;
		}
	}

	//A call to gcf finds the greatest common factor of two integers.
	public static int gcf(int greaterN, int lesserN) {
		int A = greaterN;
		int B = lesserN;
		int result;
		while (B != 0) {
			result = A % B;
			A = B;
			B = result;
		}
		return A;
	}

	//A call to sqrt returns an approximation of the square root of the
	//value passed, rounded to two decimal places.
	public static double sqrt(double n) {
		double root = 0;
		double A = n / 2;
		while (root != (n / A + A) / 2) {
			root = (n / A + A) / 2;
			A = root;
		}
		double answer = round2(root);
		return answer;
	}
	
}

	