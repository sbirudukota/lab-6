/*Sravani Birudukota
 Programming Fundamentals
 Summer 
 Exercise 1
*/
import java.util.*;

public class N_cube

{

	public static int sum(int num)

	{

		int sum = 0;

		for (int i = 0; i < num; i++)

		{

			for (int j = 0; j < num; j++)

			{

				for (int l = 0; l < num; l++)

				{

					sum += i * j / (l + 1);

				}

			}

		}

		return sum;

	}

	public static void main(String[] args)

	{
		int num;

		System.out.println("Please enter the number :");
		
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		
		sc.close();

		System.out.println("The Sum :" + sum(num));

	}

}
