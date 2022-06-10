package loosecoupling.amounttransfer;

public class Main {
	public static void main(String[] args)
	{
		int n=7;
		for(int i=1;i<=n;i+=2){
			for(int j=1;j<=n;j++)
			{
				if(i+j==5 ){
					for(j=1;j<=i;j++)
						System.out.print("*");
					break;
				}
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}


//- - - * - - - 
//- - * * * - -