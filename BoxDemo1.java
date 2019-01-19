


class Box

{ double width,w;

double height,h;

double depth,d;

Box()

{System.out.print("Constructing Box");

width=10;

height=5;

depth=10;}

Box(double w,double h,double d)

{ width=w;

height =h;

depth=d;}

double volume()

{return width*height*depth;}

}

class BoxDemo1

{ public static void main(String args[])

{double vol;

Box b1= new Box();

vol=b1.volume();

System.out.println("volume is"+vol);

Box b2= new Box(3,6,9);



vol=b2.volume();

System.out.println("volume is"+vol);

}}