import java.util.Scanner;//checking two double variables satisfy given condition of lying between two numbers
 class Main {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Input first number:");//get input from user
        double d= sc.nextDouble();
        System.out.println("Input second number:");//get second input from user
        double d1= sc.nextDouble();
        if((d>0 && d<1)&&(d1>0 && d1<1))//if two numbers lie between 0 and 1 print true 
        {
            System.out.println("true");
        }
        else                            //if condition not satisfied print false
        {
            System.out.println("false");
        }
    }
}
