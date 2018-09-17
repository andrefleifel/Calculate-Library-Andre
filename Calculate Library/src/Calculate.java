/*
 * This class contains the methods to do various math related task
 * @author Andre Fleifel
 * @version 1.0
 * @date 8-6-18
 */
public class Calculate {

	public static int square(int number) {
		return number*number;
	}
	
	public static int cube(int number) {
		return number*number*number;
	}
	
	public static double average(double number1, double number2) {
		return (number1 + number2)/2;
	}
	
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	
	public static double toDegrees(double radian) {
		return (180/3.14159)*radian;
	}
	
	public static double toRadians(double radian) {
		return (3.14159/180)*radian;
	}
	
	public static double discriminant(double a, double b, double c) {
		double discriminant = b * b - 4 * a * c;
		return discriminant;
	}
	
	public static String toImproperFrac(int a, int b, int c) {
		return a * c + b + "/" + c;
	}
	
	public static String toMixedNumber(int a, int b) {
		return a / b + " " + a % b + "/" + b;
	}
	
	public static String foil(int a, int b, int c, int d) {
		return a * c + "x^2" + "+" + (a * d + b * c) + "x" + b * d;
	}
	
	public static boolean isDivisibleBy(int a, int b) {
		if (b==0) {
			throw new IllegalArgumentException();
		}
		if (a % b == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double absValue(double a) {
		if (a > 0) {
			return a;
		} else if (a == 0) {
			return 0.;
		} else {
			return -a;
		}
	}
	
	public static double max(double a, double b) {
		if (a > b) {
			return a;
		} else {
			return b;
		} 
	}

	public static double max(double a, double b, double c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else if (c > a && c > b) {
			return c;
		} else {
			return a;
		}
	}
	
	public static int min(int a, int b) {
		if (a < b) {
			return a;
		} else if (b < a) {
			return b;
		} else {
			return a;
		}
	}

	public static double round2(double a) {
		double b = (a * 1000) % 10;
		if (b <= 4) {
			return (a * 1000 - b) / 1000;
		} else {
			return (a * 1000 - b + 10) / 1000;
		}

	}
	
	public static double exponent(double a, int b) {
		if (b==0) {
			return 1;
		}
		if (b<0) {
			throw new IllegalArgumentException();
		}
		double result = a;
		for (int x = 2; x <= b; x++) {
			result *= a;
		}
		return result;
	}
	
	public static int factorial(int a) {
		if (a<0)
			throw new IllegalArgumentException();
		int answer = a;
		for (int n = a; n >= 2; n--) {
			answer *= n - 1;
		}
		return answer;
	}

	public static boolean isPrime(int number) {
		/*
		 * Need a variable to count number of variables name it factors count starts at
		 * 1 because has at least itself
		 */
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

	
	public static double sqrt(double n) {
		// how will I get the square root? loop?
		// square root of N is about= ½(N/A + A)
		// N is number to square root and then A is educated guess
		// repeatedly replace educated guess
		// return root
		if (n<0) {
			throw new IllegalArgumentException();
		}
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
	
	