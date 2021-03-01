import java.util.Scanner;//print contents of two dimensional array
class Main {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       boolean a[][]={{true,false,true},{false,true,false}};//2D input initialised
       for(int i=0;i<a.length;i++)//loops for traversing 2D array
       {
           for(int j=0;j<a[i].length;j++)
           {
               if(a[i][j]==true)       //if conditon true 
               {
                   System.out.print('t'+ " ");
               }
               else                     //if condition false
               {
                   System.out.print('f' + " ");
               }
           }
           System.out.println();
       }
    }
}
