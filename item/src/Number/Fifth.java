package Number;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

public class Fifth {

	public static BigDecimal add(double value1,double value2) {
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		BigDecimal b2=new BigDecimal(Double.toString(value2));
		return b1.add(b2);
	}
	public static BigDecimal add(double value1) {
		BigDecimal b1=new BigDecimal(Double.toString(value1));
		return b1;
	}
	public static char getrandom(char min,char max) {
		return (char)(min+Math.random()*(max-min));
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		char a='a',b='b';
		int c;
		System.out.println("��ʮ�ȵ�����ֵ��"+Math.sin(Math.PI/2));
		System.out.println(Math.asin(0));
		System.out.println(Math.toRadians(360));
		System.out.println(Math.exp(2));
		System.out.println(Math.rint(Math.random()*10));
		System.out.println(getrandom('a', 'z'));
		c=a+b;
		System.out.println((char)c);
		Random r=new Random();
		System.out.println(r.nextInt(10));
		System.out.println(r.nextBoolean());
		BigInteger bigint=new BigInteger("2165446548748465897844784897845415897984187897481489");
		System.out.println("�Ӷ��Ľ��Ϊ��"+bigint.add(new BigInteger("2")));
		System.out.println(add(12315,454));
	}

}
