package Class_Object;


import java.util.Scanner;

public class ThRectangle {
    double width , height ;

    public ThRectangle(double width ,  double height){
        this.width = width ;
        this.height = height ;
    }
    public double getArea(){
        return(this.width * this.height);
    }
    public double getPerimeter(){
        return(this.width + this.height) * 2 ;
    }
    public String    getDisplay(){
        return "ThRectangle{" + "width =" + width + "height =" + height + "}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhap width :");
        double width = sc.nextDouble();
        System.out.println(" Nhap height :");
        double height = sc.nextDouble();
        ThRectangle hcn = new ThRectangle(width,height);
        System.out.println("hinh chu nhat : \n" + hcn.getDisplay());
        System.out.println( "Chuvi :" + hcn.getPerimeter());
        System.out.println(" Dientich :" + hcn.getArea());
    }
}




