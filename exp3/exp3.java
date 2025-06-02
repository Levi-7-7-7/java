//demonstration of an constructor.

class Box{

    int l, b, h;
    Box(int x, int y,int z){
        l=x;
        b=y;
        h=z;
    }

    int calc_volume(){
        int v = l*b*h;
        return v;
    }

    int calc_area(){
        int ar=2*(l*b+b*h+h*l);
        return ar;
    }
}

public class exp3{
    public static void main(String[] args){
        Box b1=new Box(5,5,5);
        int V=b1.calc_volume();
        int A=b1.calc_area();
        System.out.println("Volume of the box is: "+V);
        System.out.println("Area of the box is: "+A);
    }
}