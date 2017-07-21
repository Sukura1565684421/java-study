package Number;
import java.util.Date;
public class First {
	static String s1="你好";
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String s2="java";
		System.out.println(s1);
		System.out.println(s2);
		byte mybyte=124;
		short myshort=32564;
		int myint=45784612;
		long mylong=46789451;
		long result=mybyte+myshort+myint+mylong;
		System.out.println(result);
		char 字='黄',word2='鑫';
		int p=23045,p2=45213;
		System.out.println(字+"在unicode表中的位置："+(int)字);
		System.out.println("在unicode表中"+p+"代表的是："+(char)p);
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
		System.out.println("今年是:"+String.format("%tY", date));
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
			System.out.println(mail+"是一个合法的邮箱。");
		}
		else
		{
			System.out.println(mail+"是一个非法的邮箱。");
		}
		
	}

}
