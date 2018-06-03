package section1;

public class Q {
		public static void main(String[] args) {
			int i;
			int j = i; //   The local variable i may not have been initialized
			System.out.println(i);
			System.out.println(j);
		}
}
