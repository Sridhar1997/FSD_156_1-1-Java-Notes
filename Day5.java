import java.util.Scanner;

class Day5{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your age : ");
        int age=sc.nextInt();
        System.out.println(age>=18 ? "Eligible to Vote" : "Not Eligible");

        // System.out.print("Enter Radius : ");
        // double r=sc.nextDouble();
        // double area=Math.PI*r*r;
        // System.out.println("Area of Circle : "+area);

        // System.out.print("Enter a Number : ");
        // int num=sc.nextInt();
        // System.out.println(num%2==0? "Even Number" : "Odd Number");

        // System.out.print("Enter your Name : ");
        // String name=sc.nextLine();
        // System.out.println("Welcome "+name);
    }
}