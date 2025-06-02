// To illustrate the concept of the array objects.

import java.util.Scanner;

class Student{
    String result, n;
    int r, m1, m2, m3, total;

    Student(String name, int regno, int mark1, int mark2, int mark3){
        n=name;
        r=regno;
        m1=mark1;
        m2=mark2;
        m3=mark3;        
    }

    void display_result(){
        System.out.println("Name: "+n+"\n regno: "+r+"\n total marks: "+total+"\n result: "+result);
    }

    void calc_total(){
        total=m1+m2+m3;
    }

    void calc_result(){
        if(m1<40 || m2<40 || m3<40){
            result="Fail";
        }
        else{
            result="Pass";
        }
    }
}


public class exp4{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n, i, regno, mark1, mark2, mark3;
        String name;

        System.out.print("enter the number of students: ");
        n= sc.nextInt();
        
        Student students[]=new Student[n];

        for(i=0;i<n;i++){

            System.out.println("\nenter the details of the student "+(i+1)+":");
            System.out.print("Enter the name: ");
            name=sc.next();
            System.out.print("Enter the regno: ");
            regno=sc.nextInt();
            System.out.print("Enter the mark1: ");
            mark1=sc.nextInt();
            System.out.print("Enter the mark2: ");
            mark2=sc.nextInt();
            System.out.print("Enter the mark3: ");
            mark3=sc.nextInt();

            students[i]=new Student(name, regno, mark1, mark2, mark3);
            students[i].calc_total();
            students[i].calc_result();
        }

        for(i=0;i<n;i++){

            System.out.print("\n");
            students[i].display_result();
            
        }
    }
}