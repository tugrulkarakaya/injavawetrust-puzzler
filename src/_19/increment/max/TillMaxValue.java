package _19.increment.max;

public class TillMaxValue {
	public static final int END = Integer.MAX_VALUE;
	public static final int START = END - 100;

	public static void main(String[] args) {

		int count = 0;

		for (int i = START; i <= END; i++)
			count++;
		System.out.println(count);

		// Integer.MAX_VALUE = 2147483647

		// for int type
		// 2147483647+1 --> -2147483648 (it is negative !)
		// loop never ends!
	}

}
