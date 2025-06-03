// method overloading
import java.util.Scanner;

class geometricalshapes{
    float radius ;
    int length, breadth, side;

    double calc_area(double radius){
       return 3.14*(radius*radius);        
    }

    int calc_area(int length, int breadth){
       return length*breadth;        
    }

    int calc_area(int side){
        return side*side;
    }    
}

public class exp5{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        geometricalshapes ob1=new geometricalshapes();

        System.out.print("enter the radius of the circle: ");
        float r= sc.nextFloat();
        System.out.print("\n");
        System.out.print("enter the length of the rectangle: ");
        int l= sc.nextInt();
        System.out.print("enter the breadth of the rectangle: ");
        int b= sc.nextInt();
        System.out.print("\n");
        System.out.print("enter the side of the square: ");
        int s= sc.nextInt();

        System.out.print("\n");
        System.out.println("area of the circle is: "+ob1.calc_area(r));
        System.out.println("area of the rectangle is: "+ob1.calc_area(l, b));
        System.out.println("area of the square is: "+ob1.calc_area(s));

        
    }

}