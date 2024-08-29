
import java.util.Scanner;
public class circle {
    
    final double Pi=3.14559;
    double Area;
    circle(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter radius");
    double Radius=sc.nextDouble();
    Area=Pi*Radius*Radius;
    }
    public void Print(){
        System.out.println("Circle's Area  "+Area);
    }
    public static void main(String args[]){
       
        circle a=new circle();
        a.Print();
     
   }
   }

