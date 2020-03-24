package p1;

import java.util.Scanner;

public class stable {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int num;
		int flag=0,k=0;
		int arr[]=new int[10];
		int a[]=new int[10];
		System.out.println("Enter the number");
		num=sc.nextInt();
		while(num>0)
		{
			arr[num%10]++;
			num/=10;
		}
		//System.out.println("Check");
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0)
			{
				a[k++]=arr[i];
			}
			
				
		}
		for(int i=0;i<k;i++)
		{
			for(int j=0;j<k;j++)
			{
				if(i!=j)
				{
					if(a[i]!=a[j])
					{
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==0)
			System.out.println("Stable");
		else 
			System.out.println("Unstable");
	}

}
