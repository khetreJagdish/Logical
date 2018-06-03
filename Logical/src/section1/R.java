package section1;

public class R {
		public static void main(String[] args) {
			int i;
			int j =10;
			int k = i+j;//The local variable i may not have been initialized
			System.out.println(i);
			System.out.println(j);
			System.out.println(k);
		}
}
