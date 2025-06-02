//demonstration of basic java program.

class rectangle{
    int l, b, ar;

    void get_data(int length, int breadth){
        l=length;
        b=breadth;
    }

    void area(){
        ar=l*b;        
    }

    void display(){
        System.out.println("length of the rectangle is: "+l);
        System.out.println("breadth of the rectangle is: "+b);
        System.out.println("area of the rectangle is: "+ar);
    }
}

public class exp1{
    public static void main(String[] args){
        rectangle r=new rectangle();
        r.get_data(5,2);
        r.area();
        r.display();
    }
}
