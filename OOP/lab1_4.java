import java.util.*;
public class lab1_4 {
    int area(int h,int l){
    int x=h*l;
    return x;
    }
    double area1(double r){
        double a1=3.14*r*r;
        return a1;
        }

    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a,b;
        double r;
        System.out.println("enter the length");
        a=s.nextInt();
        System.out.println("enter the height");
        b=s.nextInt();
        System.out.println("enter the radius of the circle:");
        r=s.nextDouble();
        lab1_4 x=new lab1_4();
        lab1_4 x1=new lab1_4();
        System.out.println(" the area of the rectangle is "+ x.area(a,b));
        System.out.println(" the area of the c is "+ x1.area1(r));



    }
} 
    

