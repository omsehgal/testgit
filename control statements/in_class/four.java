import java.util.*;

class four {

	public static void main(String[] args) { //main program to print every digit separately of a five digit integer

		Scanner a=new Scanner(System.in);

		int number;

		char b;

		do

		{

			System.out.println("please enter the five digit integer");

			number=a.nextInt();

			if(number>99999 || number<9999)

			System.out.println("Entered number is not a ive digit number");

			else

			{

				System.out.print(" "+(number / 10000));

				System.out.print(" "+(number / 1000)%10);

				System.out.print(" "+(number / 100) % 10);

				System.out.print(" "+(number % 100) / 10);

				System.out.println(" "+(number % 10));

			}

			System.out.println("Press N to exit and Press any ker to continue");

			b=a.next().charAt(0);

		}

		while(b!='N');

	}

}