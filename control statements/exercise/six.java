
import java.util.*;

class six {

	public static void main(String[] args) { //main method to print pascal's triangle

Scanner a=new Scanner(System.in);

int rows;

int i;

int j;

int k;

int number;

char b;

do {

	System.out.println("please enter the number of rows you want");

	rows=a.nextInt();

	System.out.println("Pascal triangle is :");

	for(i=0;i<rows;i++) {

		for(k=rows;k>i;k--) {

			System.out.print(" ");

		}

		number=1;

		for(j=0;j<=i;j++) {

			System.out.print(number+ " ");

			number=number*(i-j)/(j+1);

		}

		System.out.println();

		}

		System.out.println("enter N to exit or press any key to continue ");

		b=a.next().charAt(0);

	}

	while(b!='N');

}

}