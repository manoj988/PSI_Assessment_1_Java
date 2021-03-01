import java.util.Scanner;//package for user input
class Main {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Input first number");//get four numbers from users
        int a=sc.nextInt();
        System.out.println("Input second number");
        int b=sc.nextInt();
        System.out.println("Input third number");
        int c=sc.nextInt();
        System.out.println("Input fourth number");
        int d=sc.nextInt();
        if(a==b && b==c && c==d)//compare the numbers
        {
            System.out.println("Numbers are equal");//if condition is true print equal
        }
        else
        {
            System.out.println("Numbers Not Equal");//if condition is false print not equal
        }
    }
}
