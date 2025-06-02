// demonstration of passing objects as arguements.

import java.util.Scanner;

class complex{
    int r, i;
    void get_data(){
        Scanner sc=new Scanner(System.in);
        System.out.print("real part: ");
        r=sc.nextInt();
        System.out.print("imaginary part: ");
        i=sc.nextInt();
    }
    void display(){
        System.out.println("complex number is: "+r+" + "+i+"i");        
    }
    complex add(complex c1,complex c2){
        complex c3=new complex();
        c3.r=c1.r+c2.r;
        c3.i=c1.i+c2.i;
        return c3;
    }
}

public class exp2{
    public static void main(String[] args){
        complex c1 = new complex();
        complex c2 = new complex();
        complex A = new complex();
        
        System.out.print("\n");

        System.out.println("enter the first complex number");
        c1.get_data();
        c1.display();

        System.out.print("\n");

        System.out.println("enter the second complex number");
        c2.get_data();
        c2.display();

        System.out.print("\n");

        A=A.add(c1,c2);
        System.out.print("sum of the two ");
        A.display();

        System.out.println("\n");

    }
}