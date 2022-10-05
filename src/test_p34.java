
public class test_p34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		System.out.println("num1和num2的各種計算:");
		System.out.println("num1+num2=" + (num1 + num2));
		System.out.println("num1-num2=" + (num1 - num2));
		System.out.println("num1*num2=" + (num1 * num2));
		System.out.println("num1/num2=" + (num1 / num2));
		System.out.println("num1%num2=" + (num1 % num2));
		int a = 0;
		int b = 0;
		int c = 0;
		b = a++;
		c = ++a;
		System.out.println("因為是在指定後才遞增，所以b為" + b);
		System.out.println("因為是在遞增後才指定，所以c為" + c);
	}

}
