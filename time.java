import java.util.Scanner;

class time

{public static void main(String[] Strings)

    {

    double minutesinYear =60*24*365;

    Scanner input  =new Scanner(System.in);

    	System.out.print("Input the number of minutes  ");

    	double min = input.nextDouble();

    	long years = (long) (min / minutesinYear);

    	int days   =(int)(min/60/24)%365;



    	System.out.println((int) min +"minutes is appx."+ years+ "years and"+days+"days");

    	}



  }