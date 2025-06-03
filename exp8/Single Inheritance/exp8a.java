// Single inheritance .

class BasicMath{
    int x, y;

    BasicMath(int n1,int n2){
        x=n1;
        y=n2;
    }

    int add(){
     return x+y;   
    }

    int subtract(){
     return x-y;
    }

    int multiply(){
     return x*y;
    }

    int divide(){
     return x/y;
    }
}

class AdvancedMath extends BasicMath{
    int i;
    AdvancedMath(int n1,int n2){
        super(n1, n2);
    }
    int fact=1,pow=1;
    void display(){
        int f= factorial();
        int p=power();
        System.out.println("\nFactorial of "+x+" is: "+f);
        System.out.println(x+" raised to "+y+" is: "+p+"\n");
        System.out.println("Addition is: "+super.add());
        System.out.println("subtraction is: "+super.subtract());
        System.out.println("multiplication is: "+super.multiply());
        System.out.println("division is: "+super.divide());
    }

    int factorial(){
        for (i=1;i<=x;i++){
            fact*=i;
        }
        return fact;
    }

    int power(){
        for(i=1;i<=y;i++){
            pow*=x;
        }
        return pow;
    }
}

public class exp8a{
    public static void main(String[] args){
        AdvancedMath ob1=new AdvancedMath(10,2);
        ob1.display();
    }
}