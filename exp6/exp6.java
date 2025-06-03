// static members.

import java.util.Scanner;

class MathOperation{

    static int x, y , sum, difference, product, quotient, remainder;

    static void add(){
     sum= x+ y;   
    }

    static void subtract(){
        difference=x-y;
    }

    static void multiply(){
        product=x*y;
    }

    static void divide(){
        if(y!=0){
            quotient=x/y;
            remainder=x%y;
        }
        else{
            quotient=0;
            remainder=0;
        }
    }

    static void display(){
        System.out.println("x= "+x+"\ny= "+y);
        System.out.println("sum="+sum);
        System.out.println("difference="+difference);
        System.out.println("product="+product);
        System.out.println("quotient="+quotient);
        System.out.println("remainder="+remainder);        
    }    
}

public class exp6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the x: ");
        MathOperation.x= sc.nextInt();
        System.out.print("enter the y: ");
        MathOperation.y= sc.nextInt();

        MathOperation.add();
        MathOperation.subtract();
        MathOperation.divide();
        MathOperation.multiply();

        MathOperation.display();
    }
}