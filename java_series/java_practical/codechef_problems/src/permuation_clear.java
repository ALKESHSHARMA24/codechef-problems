import java.util.Arrays;
import java.util.Scanner;

public class permuation_clear {

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in=new Scanner(System.in);

        int t=in.nextInt();
        for(int i=0;i<t;i++){

            int n=in.nextInt();
            int[] a=new int[n];
            System.out.println("enter the values ffor a");
            for(int i1=0;i1<n;i1++){
                 a[i1]=in.nextInt();

            }
            System.out.println("enter the size second array");
            int k=in.nextInt();
            int[]b=new int[k];

            System.out.println("enter the values ffor b");

            for(int i2=0;i2<k;i2++){
                b[i2]=in.nextInt();

            }
            


        }

    }
}
