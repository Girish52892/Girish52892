package loosecoupling.amounttransfer;

import java.util.Scanner;

public class VikramBetal {

	public static void main(String[] args) {

		Scanner ip=new Scanner(System.in);

		int T=ip.nextInt();
		
		for(int k=0;k<T;k++)
		{
			int count=0;
			int N=ip.nextInt();
			int[] array=new int[N];

			for(int i=0;i<N;i++)
				array[i]=ip.nextInt();

			for(int i=0;i<array.length;i++)
				for(int j=0;j<array.length;j++)
					if(array[i]==array[j] && i!=j)
						count++;
			
			System.out.println(count);
		}

		

	}

}
