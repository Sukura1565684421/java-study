package Number;
import java.text.DecimalFormat;
public class Forth {
/*	public Forth() {
	}*/
	int i=47;
	public void call() {
		System.out.println("����call����");
		for(int i=0;i<3;i++)
		{
			System.out.print(i+" ");
			if(i==2)
			{
				System.out.println("\n");
			}
		}
	}
	
	public static void Simgleformat(String pattern,double value) {
		DecimalFormat myformat=new DecimalFormat(pattern);
		String output=myformat.format(value);
		System.out.println(value+" "+pattern+" "+output);
	}
	
	public static void Use(String pattern,double value) {
		DecimalFormat myformat=new DecimalFormat();
		myformat.applyPattern(pattern);
		System.out.println(value+" "+pattern+" "+myformat.format(value));
	}
	
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Forth t1=new Forth();
		Forth t2=new Forth();
		t1.i=60;
		System.out.println("��һ��ʵ��������ñ���i�Ľ����"+t1.i++);
		t1.call();
		System.out.println("�ڶ���ʵ��������ñ���i�Ľ����"+t2.i++);
		t2.call();
		String str=Integer.toHexString(456);
		System.out.println(str);
		char b3='a';
		System.out.println(Character.toUpperCase(b3));
		Simgleformat("###,###.###", 123456.789);
		Simgleformat("00000000.###kg", 123456.789);
		Simgleformat("000000.000", 123.78);
		Simgleformat("#.###%", 0.789);
		Use("###.##", 123456.789);
		Use("0.00\u2030", 0.789);
		DecimalFormat myformat1=new DecimalFormat();
		myformat1.setGroupingSize(3);
		String output=myformat1.format(123456789.1);
		System.out.println("�����ֽ��з�����Ϊ��"+output);
		
		}

}
