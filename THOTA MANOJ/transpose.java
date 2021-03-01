import java.util.Scanner;//print array after changing rows and columns
class Main {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
       int a[][]=new int[2][3];    //initialise size of array
       int b[][]=new int[3][2];    //initialise size second array
       for(int i=0;i<2;i++)        //get 2D array input from user
       {
           for(int j=0;j<3;j++)
           {
               a[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<2;i++)
       {
           for(int j=0;j<3;j++)
           {
               b[j][i]=a[i][j];    //condition for transpose of matrix
           }
       }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(b[i][j]+ " ");   //print transposed matrix
            }
            System.out.println();
        }
    }
}
