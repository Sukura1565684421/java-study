package Number;
import java.util.Date;
public class First {
	static String s1="���";
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String s2="java";
		System.out.println(s1);
		System.out.println(s2);
		byte mybyte=124;
		short myshort=32564;
		int myint=45784612;
		long mylong=46789451;
		long result=mybyte+myshort+myint+mylong;
		System.out.println(result);
		char ��='��',word2='��';
		int p=23045,p2=45213;
		System.out.println(��+"��unicode���е�λ�ã�"+(int)��);
		System.out.println("��unicode����"+p+"������ǣ�"+(char)p);
		int a=20,b=12;
		int c=a>b?34:24;
		System.out.println(c);
		float e=2014.13f;
		System.out.println(e);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3-i;j++)
			{
				System.out.print(' ');
			}
			for(int j=0;j<5+2*i;j++)
			{
				System.out.print('*');
			}
			System.out.println();
		}
		String s=s1+" "+s2;
		System.out.println(s);
		System.out.println(s2.length());
		System.out.println(s2.indexOf("a")+" "+s2.lastIndexOf("a")+" "+s2.charAt(1));
		String s3="  hello java  ";
		System.out.println(s3.length()+" "+s3.trim().length());
		String str="192.174.0.1";
		String[] str1=str.split("\\.",3);
		for(String a1:str1) {
			System.out.print("["+a1+"]");
		}
		Date date=new Date();
		System.out.println("������:"+String.format("%tY", date));
		StringBuilder bf=new StringBuilder("hello");
		bf.append("java");
		System.out.println(bf);
		bf.insert(5," ");
		System.out.println(bf);
		bf.delete(5,10);
		System.out.println(bf);
		String str4=String.format("%d", 199/2);
		System.out.println(str4);
		String biao="\\w+@\\w+(\\.\\w{2,3})*\\.\\w{2,3}";
		String mail="1565684421@qq.com";
		if(mail.matches(biao))
		{
			System.out.println(mail+"��һ���Ϸ������䡣");
		}
		else
		{
			System.out.println(mail+"��һ���Ƿ������䡣");
		}
		
	}

}
