import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		System.out.println("---- LIST 1 ----");
		System.out.println("Task 1:  " + remainder(1, 3));
		System.out.println("Task 2:  " + triArea(7, 4));
		System.out.println("Task 3:  " + animals(2, 3, 5));
		System.out.println("Task 4:  " + profitableGamble(0.2, 50, 9));
		System.out.println("Task 5:  " + operation(24, 15, 9));
		System.out.println("Task 6:  " + ctoa('A')); // для символа \ написать: '\\'
		System.out.println("Task 7:  " + addUpTo(10));
		System.out.println("Task 8:  " + nextEdge(8, 10));
		System.out.println("Task 9:  " + sumOfCubes(new int[]{1, 5, 9}));
		System.out.println("Task 10:  " + abcmath(42, 5, 10));
		System.out.println("---- LIST 2 ----");
		System.out.println("Task 1:  " + repeat("mice", 5));
		System.out.println("Task 2:  " + differenceMaxMin(new int[]{10, 4, 1, 4, -10, -50, 32, 21}));
		System.out.println("Task 3:  " + isAvgWhole(new int[]{9, 2, 2, 5}));
		System.out.println("Task 4:  " + cumulativeSum(new int[]{3, 3, -2, 408, 3, 3}));
		System.out.println("Task 5:  " + getDecimalPlaces("43"));
		System.out.println("Task 6:  " + fibonacci(12));
		System.out.println("Task 8:  " + isStrangePair("ratio", "orator"));
		System.out.println("Task 9_isPrefix:  " + isPrefix("automation", "auto-"));
		System.out.println("Task 9_isSuffix:  " + isSuffix("arachnophobia", "-phobia"));
		System.out.println("Task 10:  \n" + hexLattice(19));
	}

	//---------- LIST 1 -----------
	//Task 1
	public static int remainder(int a, int b) {
		return a % b;
	}

	//Task 2
	public static int triArea(int a, int b) {
		return (a * b) / 2;
	}

	//Task 3
	public static int animals(int chickens, int cows, int pigs) {
		return (chickens * 2) + ((cows + pigs) * 4);
	}

	//Task 4
	public static boolean profitableGamble(double prob, int prize, int pay) {
		return (prob * prize) > pay;
	}

	//Task 5 ???????????????????
	public static String operation(int n, int a, int b) {
		if (a + b == n) {
			return "added";
		}

		if (a - b == n) {
			return "subtracted";
		}

		if (a * b == n) {
			return "multiplied";
		}

		if (a / b == n) {
			return "divided";
		}

		return "none";
	}

	//Task 6
	public static int ctoa(char value) {
		return (int) value;
	}

	//Task 7
	public static int addUpTo(int n) {
		return n * (n + 1) / 2;
	}

	//Task 8
	public static int nextEdge(int a, int b) {
		return a + b - 1;
	}

	//Task 9
	public static int sumOfCubes(int[] arr) {
		int sum = 0;
		for (int val : arr) {
			sum += Math.pow(val, 3);
		}
		return sum;
	}

	//Task 10
	public static boolean abcmath(int a, int b, int c) {
		int sum = a;
		for (int i = 1; i <= b; i++) {
			sum += sum;
		}

		return sum % c == 0;
	}


	//---------- LIST 2 -----------

	//Task 1
	public static String repeat(String str, int count) {
		char[] chars = str.toCharArray();
		String endStr = "";
		for (char value : chars) {
			for (int i = 0; i < count; i++) {
				endStr += String.valueOf(value);
			}
		}
		return endStr;
	}

	//Task 2
	public static int differenceMaxMin(int[] arr) {
		int min = 0;
		int max = 0;

		for (int value : arr) {
			if (value < min) min = value;
		}

		for (int value : arr) {
			if (value > max) max = value;
		}

		return max - min;
	}

	//Task 3
	public static boolean isAvgWhole(int[] arr) {
		float sum = 0;

		for (float value : arr) sum += value;

		return (sum / arr.length) % 1 == 0;
	}

	//Task 4
	public static ArrayList<Integer> cumulativeSum(int[] arr) {
		ArrayList<Integer> myNumbers = new ArrayList<>();
		myNumbers.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			myNumbers.add(arr[i] + myNumbers.get(i - 1));

		}

		return myNumbers;
	}
	//Task 5
	public  static String getDecimalPlaces(String d){
		Double b = Double.valueOf(d);
		String numberD = String.valueOf(b);
		numberD = numberD.substring ( numberD.indexOf ( "." ) ).replace(".","");
		return numberD;

	}

	//Task 6
	public static Integer fibonacci(int n) {
		int a = 1;
		int b = 1;
		for (int i = 2; i <= n; ++i) {
			int next = a + b;
			a = b;
			b = next;
		}
		return b;
	}

	//Task:8
	public static Boolean isStrangePair(String val1, String val2) {
		if (val1 != null || val2 != null) {
			String[] list1 = val1.split("");
			var firstLetterVal1 = Arrays.stream(list1).findFirst().get();
			String[] list2 = val2.split("");
			var firstLetterVal2 = Arrays.stream(list2).findFirst().get();
			return val1.endsWith(firstLetterVal2) && val2.endsWith(firstLetterVal1);

		} else {

			System.out.println("Одно или оба значения пусты");
			return false;
		}
	}

	//Task:9_isPrefix
	public static Boolean isPrefix(String val1, String val2) {
		String val2_2 = val2.replace("-", "");
		return val1.startsWith(val2_2);

	}

	//Task:9_isSuffix
	public static Boolean isSuffix(String val1, String val2) {
		String val2_2 = val2.replace("-", "");
		return val1.endsWith(val2_2);

	}

	//Task 10
	public static String hexLattice(int n) {
		int b;
		final String CHAR = "o", NULL_CHAR = " ", CON_CHAR = NULL_CHAR + CHAR;
		if (--n % 6 != 0 | (b = (int) (1 + Math.sqrt(n /= 3))) * (b - 1) != n) {
			return "Invalid";
		}
		StringBuilder str = new StringBuilder();
		for (int i = b; i < 2 * b - 1; ++i) {
			str.append(repeats(NULL_CHAR, 2 * b - 2 - i)).append(repeats(CON_CHAR, i)).append(System.lineSeparator());
		}
		str.append("o").append(repeats(CON_CHAR, 2 * b - 2)).append(System.lineSeparator());
		for (int i = 2 * b - 2; i >= b; --i) {
			str.append(repeats(NULL_CHAR, 2 * b - 2 - i)).append(repeats(CON_CHAR, i)).append(System.lineSeparator());
		}
		return str.toString();
	}
	private static String repeats(String s, int n) {
		return new String(new char[n]).replace("\0", s);
	}


}