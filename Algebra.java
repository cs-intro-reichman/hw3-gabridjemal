// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	
	}  

	// Returns x1 + x2
	 public static int plus(int x1, int x2) {
        if (x2 >= 0) {
            int i = 0;
            while (i < x2) {
                x1++;
                i++;
            }
        } else {
            int i = x2; 
            while (i < 0) {
                x1--;
                i++;
            }
        }
        return x1;
    }

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
        if (x2 >= 0) {
            int i = 0;
            while (i < x2) {
                x1--;
                i++;
            }
        } else {
            int i = x2;
            while (i < 0) {
                x1++;
                i++;
            }
        }
        return x1;
    }

	// Returns x1 * x2
	public static int times(int x, int y) {
    int result = 0;
    boolean negative = false;

    if (x < 0) {
        x = minus(0, x);
        negative = !negative;
    }

    if (y < 0) {
        y = minus(0, y);
        negative = !negative;
    }

    for (int i = 0; i < y; i++) {
        result = plus(result, x);
    }

    if (negative) {
        result = minus(0, result);
    }

    return result;
}


	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int power = 1;
		for (int i = 0; i < n; i++) {
			power = times(power, x);
		}
		return power;
	}
			

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		int division = 0;
		int i = 0;
		boolean negative = false;
		if (x1 < 0) {
       		x1 = minus(0, x1); 
        	negative = !negative;
    }
    	if (x2 < 0) {
        	x2 = minus(0, x2);  
     		negative = !negative;
		}
		for (i=0; plus(division, x2)<=x1; i++) {
			 division = plus(division, x2);

		}
		if (negative) {
        	i = minus(0, i);
		}
		return i;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		int mod = minus(x1,(times(x2,div(x1, x2))));
		return mod;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int i = 0;
		for (i=0; times(i, i)<=x; i++) {

		}
		return i-1;
	}	  	  
}