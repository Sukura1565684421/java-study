package Number;

public class Third {

	static final double PI=3.1415926;
	static int id;
	
	public static void method1() {
		System.out.println("方法一");
	}
	public static void method2() {
		System.out.println(Third.PI);
		System.out.println(Third.id);
		Third.method1();
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Third.method2();
		}
}
