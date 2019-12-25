public class Sample {
	/**
	* 計算する
	 */
	public int calc(int a, int b) {
		if (a < 0 || b < 0) {
			return 0;
		}
		return a + b;
	}
	
	public static void main(String[] args) {
		System.out.println("hello Sample!!!");
		Sample sample = new Sample();
		System.out.println("==>" + sample.calc(20, 30));
	}
}
