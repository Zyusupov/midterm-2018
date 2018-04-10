package math;

public class Pattern {
	public static void main(String[] args) {
//		for (int count = 1; count <= 100; count++) {
//				System.out.print(count + (count != 100 ? "," : ""));
//			}
//		}
//	}

		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */


		int n = 100;
		System.out.println("Descending order from 100");
		for (int i = n; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
