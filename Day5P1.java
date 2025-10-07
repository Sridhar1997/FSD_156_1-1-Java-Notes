public class Day5P1 {
    // static void display(){
    //     System.out.println("Welcome to Credo Systemz");
    // }

    // without arg/par, without return type

    // static void add(){
    //     int a=10;
    //     int b=20;
    //     System.out.println(a+b);
    // }

    // with arg, without return type

    // static void add(int a, int b){
    //     System.out.println(a*b);
    // }

    // without arg, with return type

    // static int add(){
    //     int a=100;
    //     int b=90;
    //     return a+b;
    // }

    // with arg, with return type

    // static int add(int a, int b, int c, int d, int e){
    //     return a+b+c+d+e;
    // }

    static void checkAge(int age){
        if(age>=18){
            System.out.println("VE");
        }
        else{
            System.out.println("NVE");
        }
    }

    public static void main(String[] args) {
        // display();
        // add();
        // add(10,90);
        // System.out.println(add());
        // System.out.println(add(10,20,30,40,50));
        checkAge(20);
        checkAge(30);
        checkAge(12);
    }
    
}
