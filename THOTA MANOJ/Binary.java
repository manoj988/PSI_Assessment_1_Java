import java.util.Scanner;

class bin {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input the first number");//get input from user
        int n= s.nextInt();
        String a=Integer.toBinaryString(n); //convert to binary 
        System.out.println(a);
        //System.out.println(a.length());//find the length of string
        int count=0;
        for(int i=0;i<a.length();i++) {
            if(a.charAt(i)=='0'){
                count=count+1;

            }
        }
        System.out.println(count); //print the number of zeros
    }
}