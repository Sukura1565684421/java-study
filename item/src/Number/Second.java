package Number;

import java.util.Arrays;
public class Second {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String str[]= {"一","二","三","四"};
		int arr[]=new int[] {1,4,2,3};
		System.out.println("str中的元素是");
		for(int i=0;i<4;i++)
		{
			System.out.print(str[i]);
		}
		System.out.println("\narr中的元素是");
		for(int i=0;i<4;i++)
		{
			System.out.print(arr[i]);
		}
		String str1[][]= {{"一","二","三","四"},{"1","2","3","4"}};
		System.out.println("str1[0]中的元素是");
		for(int i=0;i<4;i++)
		{
			System.out.print(str1[0][i]);
		}
		System.out.println("\nstr1[1]中的元素是");
		for(int i=0;i<4;i++)
		{
			System.out.print(str1[1][i]);
		}
		System.out.println(str1[1].length);
		for(String x[]:str1)
		{
			int j=0;
			for(String k:x)
			{
				j++;
				if(j==x.length)
				{
					System.out.println(k);
				}
				else
				{
					System.out.print(k+"  、");
				}
			}
		}
		Arrays.fill(str, 1,3,"2");
		System.out.println("str中的元素是");
		for(int i=0;i<4;i++)
		{
			System.out.print(str[i]);
		}
		Arrays.sort(arr);
		int newarr[]=Arrays.copyOfRange(arr,1,3);
		System.out.println("arr中的元素是");
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]);
		}
		System.out.println("转置前：");
		int arr2[][]= {{1,2,3},{4,5,6},{7,8,9}};
		for(int i[]:arr2)
		{
			show(i);
			System.out.println();
		}
		int bei;
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=i;j<arr2[i].length;j++)
			{
				bei=arr2[i][j];
				arr2[i][j]=arr2[j][i];
				arr2[j][i]=bei;
			}
		}
		System.out.println("转置后：");
		for(int i[]:arr2)
		{
			show(i);
			System.out.println();
		}
		
	}
	public static void show(int[] a) {
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		
	}
}
