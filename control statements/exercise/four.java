import java.util.*;

import java.lang.*;

class four {

	public static void main(String[] args) //main program to compute the sum of the series

	{

		Scanner a=new Scanner(System.in);

		int number;

		int i;

		int terms;

		int j;

		double answer=0;

		int factorial=1;

		System.out.println("please enter the series whose sum you want to calculate");

		number=a.nextInt();

		System.out.println("please enter the number of terms you want");

		terms=a.nextInt();

		for(j=1;j<=terms;j++)

		{

			factorial=factorial*j;

		}

		for(i=0;i<j;i++)

		{

			answer=answer + Math.pow(number,i)/factorial;

		}

		System.out.println("answer is:");

		System.out.println(answer);

	 }

}