
import java.util.*;

class Box

{ double width,w;

double height,h;

double depth,d;

void setDim()

{ w= width;

h=height;

d=depth;}

double volume()

{return w*h*d;}

}

class BoxDemo

{ public static void main(String args[])

{double vol,vol1; 

Scanner s1 =new Scanner(System.in);

Box b1= new Box();

Box b2= new Box();

System.out.print("Enter the value for the box 1:");

b1.width=s1.nextInt();

b1.height=s1.nextInt();

b1.depth=s1.nextInt();

b1.setDim();

vol1=b1.volume();

System.out.println("volume is"+vol1);

System.out.print("Enter the value for box 2:");

b2.width=s1.nextInt();

b2.height=s1.nextInt();

b2.depth=s1.nextInt();

b2.setDim();

vol=b2.volume();

System.out.print("volume is"+vol);}}